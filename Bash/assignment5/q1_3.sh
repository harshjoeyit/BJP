read num < file1.txt

for ((i=1; i<=10; i++))
do
    echo $num "*" $i "=" $((num*i))
done