#!/bin/bash
for i in {1..100}
do
   for j in {1..100}
    do
    echo -n $(((RANDOM % 10) + 1))
    echo -n " "
    done
    echo
done