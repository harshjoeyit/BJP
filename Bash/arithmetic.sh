

#! /usr/bin/bash

echo -e "enter n1: \c"
read n1
echo -e "enter n2: \c"
read n2


echo  "n1+n2: $(( n1 + n2 )) "
echo  "n1-n2: $(( n1 - n2 )) "
echo  "n1/n2: $(( n1 / n2 )) "
echo  "n1*n2: $(( n1 * n2 )) "
echo  "n1%n2: $(( n1 % n2 )) "


#using expr for arithmetic calculations

echo  "n1+n2: $( expr $n1 + $n2 ) "
echo  "n1-n2: $( expr $n1 - $n2 ) "
echo  "n1/n2: $( expr $n1 / $n2 ) "
echo  "n1*n2: $( expr $n1 \* $n2 ) "		#must use \* for multiplication - escape *
echo  "n1%n2: $( expr $n1 % $n2 ) "

