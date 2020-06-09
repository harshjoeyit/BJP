

#! /usr/bin/bash

# 2 - is the value of the SIGINT signal (ctrl+c)
#
trap "echo -e \tExit Command Ctrl+C pressed  " 2

# exeption to trap 
# it cannot trap the SIGKILL and SIGSTOP commands
trap "echo -e \tExit Command is detected " SIGKILL

file=/home/harshit/Desktop/ShellScripts/textfile.txt

trap "rm -f $file && echo $file deleted; exit" 0 2 15
# on any of these signals file is forced delete 

echo "pid is $$"

while (( COUNT < 10 ))
do
	sleep 2	
	(( COUNT ++ ))
	echo $COUNT
done



exit 0

# script can be ended with Ctrl + C  
# - it is a interrupt signal 
# - SIGINT in signal terms  
# script can be ended with Ctrl + Z
# - SIGTSTP in terms of siignal terms 

#on another terminal we can 
# kill -9 3784(PID) 
# sSIGKILL signal 


#..............................
# trap can hold on to the kill commands 

#displays the trap messege when the exit status is detected
