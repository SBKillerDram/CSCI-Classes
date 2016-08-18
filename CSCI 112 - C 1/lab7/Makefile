# Makefile for proto.h, Lab7.c, trap.c, xSquaredSinX, halfCircle.c, testFunction.c
# Jeremiah Locke, csci112
# 3/05/12

lab7: lab7.o trap.o xSquaredSinX.o halfCircle.o testFunction.o
	gcc -o lab7 lab7.o trap.o xSquaredSinX.o halfCircle.o testFunction.o
lab7.0: lab7.c proto.h
	gcc -c lab7.c
trap.o: trap.c proto.h
	gcc -c trap.c
xSquaredSinX.o: xSquaredSinX.c proto.h
	gcc -c xSquaredSinX.c
halfCircle.o: halfCircle.c proto.h
	gcc -c halfCircle.c
testFunction.o: testFunction.c proto.h
	gcc -c testFunction.c
