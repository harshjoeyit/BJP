

#! /usr/bin/bash


os=('ubuntu' 'windows' 'mac' 'kali')

echo "${os[@]}"

#length
echo "elements: ${#os[@]}"

#indices
echo "${!os[@]}"


echo "${os[0]} has ${#os[0]} char"
echo "${os[1]}"
echo "${os[2]}"
echo "${os[3]} has ${#os[3]} char"

#assigning
os[0]='mackintosh'

echo "${os[0]} has ${#os[0]} char"


#removing elements

unset os[2]

# we can add at any index 
os[10]='OxygenOS'

#print again
echo "${os[@]}"


#the while string is assigned at the zeroth index
str=abcdefg
echo "${str[@]}"
#nothing is printed sice the 1 index is empty 
echo "${str[1]}"

#length
echo "elements: ${#str[@]}"
#only on elements 




