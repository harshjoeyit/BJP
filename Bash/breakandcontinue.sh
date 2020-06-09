

#! /usr/bin/bash

# prints only the odd elements untill 10
for (( i=1; i<15; i++ ))
do
	if (( $i > 10 ))
	then
		break
	fi	

	if (( $i%2 == 0 ))		
	then
		continue
	else
		echo $i
	fi
done
