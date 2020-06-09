

#! /usr/bin/bash

# -e interprets the escape sequences
#	\c keeps the cursor on the same line					
echo -e "Enter the name of the file : \c"

read file_name

#  using the \" escape sequence  
#  -e is flag for if the file exist s ir not 
if [ -e $file_name ]
then 
	echo -e "\"$file_name\" found"
else
	echo -e "\"$file_name\" not found" 

fi


if [ -s $file_name ]
then 
	echo -e "empty file"
else
	echo -e "non empty file" 
	
fi


echo -e "Enter the name of the dir : \c"

read dir_name

#-d is the flag for a directory 

if [ -d $dir_name ]
then 
	echo -e "\n \"$dir_name\" found \n"
else
	echo -e "\n \"$dir_name\" not found \n" 

fi



# charchetr special files	- text , char , code  	flag -c
# block special files		-audio video		flag -b
# for checking the read , write , execute permissions use -r -w -x flags 



