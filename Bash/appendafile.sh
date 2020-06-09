

#! /usr/bin/bash

echo -e "Enter the name of the file: \c"
read file_name

if [ -f $file_name ]		# if it is a valid condition 
then 
	if [ -w $file_name ]				# if the file has write conditions 
	then 
		echo "type some text to append to $file_name . To quit press CTRL + D"
		cat >> $file_name
	else
		echo "the file does not have the write permissions"	
	fi
else
	echo "$file_name not exist"
fi
