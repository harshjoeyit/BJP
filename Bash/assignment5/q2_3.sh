input="file2.txt"
src="?"
des="?"
while IFS= read -r line
do
    if [ $src = "?" ]
    then
        src=$line	
	    echo "source set"
        echo $src 
    else
        des=$line
        echo "dest set"
        echo $des
    fi
done < $input

cp -r $src $des