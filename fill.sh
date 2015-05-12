#!/bin/bash
for i in {1..1000}
do
   for j in {1..1000}
    do
    number=($RANDOM %= 20)
    echo -n $number
    echo -n " "
    done
    echo
done