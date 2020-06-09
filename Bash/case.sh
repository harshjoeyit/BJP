

#! /usr/bin/bash




#! /usr/bin/bash


echo -e "enter vehicle : \c"
read vehicle

case $vehicle in
	
	"car" )
		echo -e "rent of car is \$100 ";;
	"van" )
		echo -e "rent of van is \$50 ";;
	"bike" )
		echo -e "rent of van is \$50 ";;
	
	* )	# wildcard which matckes any text
		# default case 
		echo -e "unknown ";;
	
esac


echo -e "enter char : \c"
read value


case $value in
	
	[a-z] )
		echo -e "Lowercase ";;
	[A-Z] )
		echo -e "Uppercase ";;
	[0-9] )
		echo -e "number ";;
	? )
		echo -e "special char ";;

	* )	# wildcard which matckes any text
		# default case 
		echo -e "unknown ";;
	
esac





