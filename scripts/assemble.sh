#!/bin/bash
#
# Post build assembly script
#
echo -n "Rebuilding docs directory..."
'rm' -rf docs
cp -rp target/generated-sources/swagger/docs .
echo "done"

echo -n "Creating new README.md..."
'rm' README.md
cat preamble.md target/generated-sources/swagger/README.md > README.md
echo "done"
