#!/bin/bash     
echo "MATRIX_FLOAT"
echo "4000 2000"
for i in {1..4000}
do
   for j in {1..2000}
    do
    echo -n $((RANDOM % 10))
    echo -n " "
    done
    echo
done