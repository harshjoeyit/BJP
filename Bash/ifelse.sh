

#! /usr/bin/bash

count=10

#-eq	equal 
#-ne	not equal	
#-ge	greater than equal to 
#-lt	
#-gt
#-le


# there is a space between the square brackets and if ( if_[] )
if [ $count -ne 9 ]
then 
    echo "condition is true "
fi	#statement must end with fi 

if (( $count > 9 ))
then 
    echo "condition is true "
fi	# condition check must end with a fi 




# comapring the string 


word=abc

if [ $word = "abc" ]
then	
	echo "strings are same "
fi

if [ $word != "abc" ]
then 
	echo "strings are not same "  
fi




#using the else condition 

comp=bbc

if [[ $word < $comp ]]
then
	echo $word " < " $comp
else
	echo $word " > " $comp

fi





#another way of using multiple condition 

if [[ $word < $comp ]]
then
	echo $word " < " $comp
elif [[ $word = $comp ]]
then
	echo $word " = " $comp
else
	echo $word " > " $comp

fi

echo "end of script"
