

#! /usr/bin/bash

# by default every variable in the script is a global variable 
#local makes the variable local , and can be used inside a variable 

function print()
{
	#1
	name=$1
	echo "I am $name"
}

#2
name="Zaza"
echo "the name is $name : Before function call"

print Sanjay	


#name has the value of the local variable 
#since want to print the value of 1 not 2
echo "I am $name : After function call"		


# so we use the local variable 

echo
function print1()
{
	#local
	local name1=$1		
	echo "I am $name"
}


name1="Zaza"
echo "the name is $name1 : Before function call"

print Tom	


#name has the value of the local variable 
#since want to print the value of 1 not 2
echo "I am $name1 : After function call"	
