#!/bin/bash
#
# Diff two ESI swagger configurations by date
#
# $1 - first date
# $2 - second date
# $3 - outdir
#
pp=${TMPDIR}/esi_diff_$$
outdir=$3
mkdir -p ${pp}
mkdir -p ${outdir}
trap "rm -rf ${pp}" EXIT
cat spec_snapshots/swagger.latest.${1}.json | jq '.' > ${pp}/swagger.latest.${1}.pretty.json
cat spec_snapshots/swagger.latest.${2}.json | jq '.' > ${pp}/swagger.latest.${2}.pretty.json
v1=${pp}/swagger.latest.${1}.pretty.json
v2=${pp}/swagger.latest.${2}.pretty.json

# Save reference copy of versions
cp ${pp}/swagger.latest.*.pretty.json ${outdir}

# Check for new main spec sections
cat ${v1} | jq 'keys' > ${pp}/section_1.txt
cat ${v2} | jq 'keys' > ${pp}/section_2.txt
if ! diff -q ${pp}/section_1.txt ${pp}/section_2.txt > /dev/null 2>&1 ; then
    echo "New main specification section"
    diff ${pp}/section_1.txt ${pp}/section_2.txt > ${outdir}/section_spec_diffs.txt
fi

# Check for new security definitions
cat ${v1} | jq '."securityDefinitions"' > ${pp}/sec_1.txt
cat ${v2} | jq '."securityDefinitions"' > ${pp}/sec_2.txt
if ! diff -q ${pp}/sec_1.txt ${pp}/sec_2.txt > /dev/null 2>&1 ; then
    echo "Security definitions changed"
    diff ${pp}/sec_1.txt ${pp}/sec_2.txt > ${outdir}/sec_diffs.txt
fi

# Check for new paths
cat ${v1} | jq '."paths" | keys' > ${pp}/paths_1.txt
cat ${v2} | jq '."paths" | keys' > ${pp}/paths_2.txt
if ! diff -q ${pp}/paths_1.txt ${pp}/paths_2.txt > /dev/null 2>&1 ; then
    echo "New paths found"
    diff ${pp}/paths_1.txt ${pp}/paths_2.txt > ${outdir}/path_diffs.txt
fi

# Perform per common path diffs
echo "Checking common paths"
for i in $(cat ${v1} | jq '."paths" | keys | .[]') ; do
    for j in $(cat ${v2} | jq '."paths" | keys | .[]') ; do
	if [ "${i}" == "${j}" ] ; then
	    cat ${v1} | jq '."paths" | .'${i} > ${pp}/d1.txt
	    cat ${v2} | jq '."paths" | .'${i} > ${pp}/d2.txt
	    if ! diff -q ${pp}/d1.txt ${pp}/d2.txt > /dev/null 2>&1 ; then
		echo "Changes in path ${i}"
		clean=$(echo ${i} | tr '/' '+' | tr -d '{' | tr -d '}') 
		diff ${pp}/d1.txt ${pp}/d2.txt > ${outdir}/path_diffs_${clean}.txt
	    fi
	fi
    done
done

# Done
echo "Diff check complete, complete specs saved in output dir"
