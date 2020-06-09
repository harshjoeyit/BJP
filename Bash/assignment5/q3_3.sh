read filename < file4.txt

echo -e "lines : \c" 
wc -l < $filename
echo -e "words : \c" 
wc -w < $filename
echo -e "chars : \c" 
wc -c < $filename