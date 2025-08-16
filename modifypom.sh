#!/bin/bash

# modifypom.sh

for dir in mall-*/; do
  pom="$dir/pom.xml"
  if [ -f "$pom" ]; then
    echo "删除原 parent: $pom"
    sed -i '' '/<parent>/,/<\/parent>/d' "$pom"

    # 可选：删除子模块原来的 groupId 和 version
    #sed -i '' '/<groupId>/d' "$pom"
    #sed -i '' '/<version>/d' "$pom"

    # 然后插入自定义 parent
sed -i '' '/<modelVersion>/a\
	<parent>\
		<groupId>com.panda</groupId>\
		<artifactId>mall</artifactId>\
		<version>0.0.1-SNAPSHOT</version>\
		<relativePath>../pom.xml</relativePath>\
	</parent>
	' "$pom"

  fi
done
