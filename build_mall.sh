#!/bin/bash

# 1. 解压所有 zip 到当前目录
for f in *.zip; do
  echo "解压: $f"
  unzip -o "$f" &
done
wait

# 2. 构建所有 mall-* 目录（并行）
for dir in mall-*/; do
  echo "构建: $dir"
  (cd "$dir" && mvn clean install) &
done
wait

echo "✅ 所有 mall-* 项目构建完成"
