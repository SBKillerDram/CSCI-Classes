# Makefile for lab9
# Jeremiah Locke,  CSCI 112, lab9
# 4/3/12

lab9: lab9.o BinarySearch.o
	gcc -o lab9 lab9.o BinarySearch.o
lab9.o: lab9.c Proto.h
	gcc -c lab9.c
BinarySearch.o: BinarySearch.c Proto.h
	gcc -c BinarySearch.c
