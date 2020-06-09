echo -e "You want a table. \nGive me number!"
echo -e "num: \c"
read num

for ((i=1; i<=10; i++))
do
    echo $num "*" $i "=" $((num*i))
done