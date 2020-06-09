

#! /usr/bin/bash

echo "bash version: ${BASH_VERSION}"

#until loops

n=1

# commands are executed only if the condition is false 
until (( n >= 10 ))
do
	echo -e "$n \c"
	(( n++ ))
done
echo



#for loops
#.......................
for var in 1 2 3 4 5
do 
	echo -e "$var \c"
done
echo

#..........................
for var in {1..15}
do 
	echo -e "$var \c"
done
echo

#..........................
for var in {1..20..2}	#{ start..end..increment}
do 
	echo -e "$var \c"
done
echo

#..........................
for (( i=0; i<5; i++ ))
do 
	echo -e "$i \c"
done
echo




