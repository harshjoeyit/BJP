

#! /usr/bin/bash

n=1;

while [ $n -le 10 ]		# method
do
	echo -e "$n \c"
	n=$(( n+1 ))
done

echo 

n=1

while [ $n -le 10 ]		# method 2
do
	echo -e "$n \c"
	(( n++ ))
done

echo 


n=1

while (( $n <= 10 ))		# method 3
do
	echo -e "$n \c"
	(( n++ ))
	sleep 0.5
done

echo 


n=1;

while (( $n != 4 ))		# method, change 
do
	echo -e "$n \c"
	(( n++ ))
	gnome-terminal &	# opens  a new terminal until the loop runs
done 

echo 





