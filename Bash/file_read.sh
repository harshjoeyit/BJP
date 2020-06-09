#!/bin/bash
input="file1.txt"
while IFS= read -r line
do
  echo $line
done < $input

#IFS reads the line with the white space 
# while in normal case the line is read untill the white space in seen

# input="file1.txt"
# while IFS= read -r line
# do
#   echo $line
# done < $input