#!/bin/bash

rm files/* 

for N in {40..49}
do
	for I in {1..1}
	do
		./blocksworld $N > files/$N-$I.pddl
		../FF-X/ff -o domain.pddl -f files/$N-$I.pddl > files/$N-$I.output
	done
	echo $N
done
