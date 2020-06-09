

#! /usr/bin/bash

# displays the ordered list , and prompts to select one of the list items 
select name in mark jon tom ben rick
do
					case $name in

	mark)
		echo "mark won"
	;;
	jon)
		echo "jon won"
	;;
	ben)
		echo "ben won"
	;;
	*)
		echo "none"
	
					esac
done
echo
