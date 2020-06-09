#do not use first line for writing hash bang - gives an error , use # for commenting in the scripts 
#! usr/bin/bash

# this is a comment
echo "Hello World"

# two types are variable 
#   system variable    -    UpperCases
#   user defined variables  -   may be lower cases 

echo "bash         : "   $BASH
echo "bash version : "   $BASH_VERSION
echo "home         : "   $HOME
echo "pwd          : "   $PWD

name='Harshit Gangwar'
Val=20
VAl=10
echo "my name is" $name
#prints the first encounterd value 
echo "value: " $Val