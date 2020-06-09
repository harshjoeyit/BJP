

#! /usr/bin/bash

# commands are executed sequentially using the loop
for command in ls pwd date 		
do
	echo "-------------------------$command-------------------------------"
	$command			# execute
done 

#...................................................
# if directory , then print its name
echo "Directories: "
for item in *		
do
	if [ -d $item ]			# -d $item -> checks if the item is a directory
	then
		echo "$item"		# -f flag for file	
	fi		
done 


