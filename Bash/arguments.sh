
#! /usr/bin/bash

# these are the variable to store the arguments passed form the terminal 
# $0 is for the 0th arg i.e. the file name

#uncomment this line to use 
echo "args 1 2 3:    "$0 $1 $2 $3  '< echo  $0 $1 $2 $3' 

#the arguments must be passed as with the space after the ./file.sh arg1 arg2 ag3 
# any argument less than or more than the variable specified are ignored 

#convert the arguments to array , they are stored here
args=("$@")
#     first arg   second arg   third arg                , filename is not displayed
echo "args:          "${args[0]}  ${args[1]}  ${args[3]} ${args[2]}
# prints all the values stored at once 
echo "args:         " $@

#for the number of the args passed is stored in a default variable 
echo "no of args:   " $#