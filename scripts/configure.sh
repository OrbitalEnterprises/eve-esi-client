#!/bin/bash
#
# Set the current date on the pom file.  This changes the release version
# of the build to the current date.  This script should be executed from
# the distribution root.
#
reldate=$(date +'%Y%m%d')
echo -n "Substituting release date of ${reldate}..."
sed -r -i -e '/<packaging>jar<\/packaging>/,+1 s/1\.0\.0\.[0-9]+/1.0.0.'${reldate}'-SNAPSHOT/' pom.xml
#sed -r -i -e 's/<tag>[0-9]+/<tag>'${reldate}'/' pom.xml
echo "done"
