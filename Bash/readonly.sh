

#! /usr/bin/bash

var=31
readonly var

var=50
echo "var: $var"

#......................................
#functions can also be made read only 

hello()
{
	echo "Hello World"
}

# -f option to make the function read only
hello

#we cannot overite a function
hello()
{
	echo "Hello Baby"
}

hello

readonly -f hello

hello()
{
	echo "Hello Baby"
}

hello




#...........................................

#lists the readonly functions declared in the script 
readonly -f
#list all the reaonly variables  in BASH
readonly -p
# list of the readonly variables in BASH 
readonly 

