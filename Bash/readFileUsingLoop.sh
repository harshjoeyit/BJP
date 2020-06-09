

#! /usr/bin/bash

while read line		#method 1

do
	echo $line

done < textfile.txt
echo




cat test.sh | while read line		# method 2

do
	echo $line

done < textfile.txt
echo




# IFS - internal feel seperator	- recognizes the word boundaries 
#     IFS_ -> IFS has value space -> ' '
# the space between = and read is the value of IFS = ' '
# -r prevents the escape sequences from being interpreted  
while IFS= read -r line		#method 3

do
	echo $line

done < textfile.txt
echo



while IFS=' ' read -r line		#method 4

do
	echo $line

done < textfile.txt
echo


