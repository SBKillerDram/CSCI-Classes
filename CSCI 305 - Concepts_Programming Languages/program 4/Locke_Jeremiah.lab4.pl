% Jeremiah Locke
% CSCI 305 Lab 4
:- consult('royal.pl').

mother(M,C) :- parent(M,C), female(M). % Finds the mother of the child
father(F,C) :- parent(F,C), male(F). % Finds the father of the child
spouse(M,F) :- married(M,F)|married(F,M). % Finds the spouse of the given person

child(C,P) :- parent(P,C). % Finds the parent of given child
son(M,C) :- child(M,C), male(M). % Find the children that are only boys
daughter(M,C) :- child(M,C), female(M). % Find the children that are only girls
sibling(A,B) :- parent(P,A), parent(P,B). % finds the siblings of given person
brother(M,S) :- sibling(M,S), male(M). % Finds the brother of given person
sister(F,S) :- sibling(F,S), female(F). % Finds the sisters of given person

uncle(U,P) :- father(C,P), sibling(U,C), male(U). % Finds blood related uncles
uncle(U,P) :- mother(C,P), sibling(U,C), male(U). % Finds marrage related uncles
aunt(A,P) :- father(C,P), sibling(A,C), female(A). % finds blood related aunts
aunt(A,P) :- mother(C,P), sibling(A,C), female(A). % Finds marrage related aunts

grandparent(G,C):- parent(G,P), parent(P,C). % Finds the grandparent of given person
grandfather(G,C) :- grandparent(G,C), male(G). % Finds the grandfather of given person
grandmother(G,C) :- grandparent(G,C), female(G). % Finds the grandmother of the given person
grandchild(C,P) :- grandparent(P,C). % Finds grandchild of given person

ancestor(A,D) :- parent(A,D). % Finds the ancestor of given person
ancestor(A,D) :- parent(A,C), ancestor(C,D).
descendant(A,D) :- parent(A,D). % Finds the descendant of given person
descendant(A,D) :- parent(A,C), descendant(C,D).

older(X,Y) :- born(X,A), born(Y,B), A>B.
younger(X,Y) :- born(X,A), born(Y,B), A<B.
regentWhenBorn(X,Y) :- reigned(X,B,C), born(Y,D), B=<D, D=<C. % Returns who is reigning when somone is born