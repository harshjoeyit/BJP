
#! /usr/bin/bash   


echo "enter names (space seperated): "
# read is used to take input from terminal 
read name1 name2 name3
#enter the space seperated names
echo "names are : " $name1 , $name2 , $name3



# input on the same line as messege 
read -p 'USERNAME: '  user_var
#'USERNAME' is basicalliy an alias apperaing on screen for us as a prompt
#hide the input 
# -s flag is for silent i.e. an input that is not visible 
read -sp 'PASSWORD: ' pass_var

echo
echo "username:  $user_var"
#this line may not be needed
echo  "password: " $pass_var



#using an array 
echo "Enter names: "
#   -a flag for array 
read -a names
# mind the syntax 
echo "NAMES:  ${names[0]} ,  ${names[1]} " 



# another example 
echo "Name "
read   #here is no variable
#by default our input goes in the variable called REPLY
echo "Name:  $REPLY "