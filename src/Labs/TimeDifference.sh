#!/bin/bash

javac -d . TimeDifference.java

l=(230000  123245  23245  245)
r=(210001  112955  32815  235)
a=(15959   10250   -5530  10)
i=(0 1 2 3)

mydir=$(echo $PWD)

for j in ${i[@]}; do
	cmd="${l[$j]}\n${r[$j]}"
	echo -e $cmd
	result=$(echo -e $cmd | java Labs.TimeDifference)
	echo "$result"
done
