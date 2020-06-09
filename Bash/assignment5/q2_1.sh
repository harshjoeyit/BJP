echo "copy files"
echo -e "source \c"
read src
echo -e "destination \c"
read dst

cp -r $src $dst