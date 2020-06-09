

#! /usr/bin/bash

echo -e "enter an age: \c"

read age

#one way to use the and operator


if [ "$age" -gt 18  ] && [ "$age" -lt 30 ]
then
	echo "valid age "
else
	echo "invalid age "
fi

#		-a is adn operator 

if [ "$age" -gt 18  -a "$age" -lt 30 ]
then
	echo "valid age "
else
	echo "invalid age "
fi

# using double sqaure brackets 

if [[ "$age" -gt 18   &&  "$age" -lt 30 ]]
then
	echo "valid age "
else
	echo "invalid age "
fi




