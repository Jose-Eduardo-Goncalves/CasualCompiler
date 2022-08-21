#!/bin/bash
var=$1
java -cp lib/antlr-4.8-complete.jar:bin/ casual.Main $var
size=${#var}
cfile=${var:0:size-4}'.c'
clang -S -emit-llvm $cfile
IFS=/ read -ra x <<< "$var"
s2=${#x[@]}
dir=$(pwd)
llc ${x[$s2-1]:0:${#x[$s2-1]}-4}'.ll'
clang -o ${x[$s2-1]:0:${#x[$s2-1]}-4} ${x[$s2-1]:0:${#x[$s2-1]}-4}'.s'