

#! /usr/bin/bash

#1.
#function name(){
#	commands
#}

#2.
#name(){
#	commands
#}


quit ()
{
	echo "exiting the script"
	exit
}

function printhello()
{
	echo "Hello"
}




#declaration can be done in any sequence 
#function calls
#sequence is important
printhello



#args

function print()
{
	echo $1 $2
}


print good morning	# $1- good , $2 - morning
print howr you

quit
