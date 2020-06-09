# use -x option to debug , provides the running status of the script
# $ bash -x ./test.sh

# another option is to use set -x at the beginning of the script

# also set +x stops the debugging from that point 
#set -x
#set +x

trap "echo -e \tExit Command Ctrl+C pressed  " 2

echo "PID is $$"
while (( COUNT < 10 ))
do
	sleep 0.5
	(( COUNT ++ ))
	echo $COUNT
done



