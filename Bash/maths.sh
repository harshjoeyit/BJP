

#! /usr/bin/bash

echo "20.5+5" | bc	
echo "20.5-5" | bc
echo "20.5%5" | bc
echo "20.5*5" | bc
#scale- decimal places
echo "scale=2;20.5/5" | bc


num1=0.16
num2=2.5

echo -e " $num1+$num2" | bc	
echo "$num1-$num2" | bc

#caluculating the square 

echo -e "sq. root($num1) = \c"
echo "scale=2;sqrt($num1)" | bc -l		# -l for math library 

num3=2
num4=5

echo "scale=2;($num3^$num4)" | bc -l
