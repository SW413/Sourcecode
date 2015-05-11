#!/bin/bash
for i in {1..3000}
do
   for j in {1..4000}
    do
    number=($RANDOM %= 20)
    echo -n $number
    echo -n " "
    done
    echo
done