

#! /usr/bin/bash

#check with if the file exist or not 
# we pass an argument as a file name to be searched 

usage()
{
	echo "provide an argument"
	echo "usage : $0 file_name"
}

function is_file_present()
{
	local file="$1"
	#-f flag to check if a file is present 
	[[ -f "$file" ]] && return 0 || return 1
}

#returns the no of args
if [[ $# -eq 0 ]]
then
	usage
fi

if ( is_file_present "$1" )	#if no args are given then $1 is blank , and there is no file with blank name 
then	
	echo "file found"
else
	echo "file not found"
fi
