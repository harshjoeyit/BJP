

#! /usr/bin/bash

echo -e "enter an age: \c"

read age

#one way to use the and operator


if [ "$age" -lt 18  ] || [ "$age" -gt 22 ]
then
	echo "not college grad "
else
	echo "colege grad "
fi

#		-a is adn operator 

if [ "$age" -lt 18 -o "$age" -gt 22 ]
then
	echo "not college grad "
else
	echo "colege grad "
fi
# using double sqaure brackets 

if [[ "$age" -lt 18 || "$age" -gt 22 ]]
then
	echo "not college grad "
else
	echo "colege grad "
fi




