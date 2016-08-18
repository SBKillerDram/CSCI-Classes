#lang racket
(define (f lst)
  ; checks to see if the set is null ;
  (if (null? lst)
      ; returns an empty set ;
      '()
      ; adds 1 to 1st element then calls f with the rest of the set ;
      (cons (+ 1 (car lst)) (f (cdr lst)))))
(define (member? e 1st)
  ; checks to see if the list is null ;
  (cond ((null? 1st) #f)
        ; checks to see if the 1st element matches e ;
        ((equal? e (car 1st)) #t)
        ; if not found it calls member? again with the 2nd element in the list ;
        (else (member? e (cdr 1st)))))
(define (set? 1st)
  ; checks to see if the set is empty ;
  (cond ((null? 1st) #t)
        ; checks to see if the first element is in the rest of the list ;
        ((member? (car 1st) (cdr 1st)) #f)
        ; recursivly calls set with the rest of the set until the a duplicate is found ;
        ; or until it goes thru the entire set and finds no duplicates ;
        (else (set? (cdr 1st)))))
(define (union 1st1 1st2)
  ; checks to see if set1 is null and if yes returns set22 ;
  (cond ((null? 1st1) 1st2)
        ; checks to see if set2 is null and if yes returns set1 ;
        ((null? 1st2) 1st1)
        ; takes the 1st part of set1 and adds it to the rest and set2 ;
        (else (cons (car 1st1) (union (cdr 1st1) 1st2)))))
(define (intersect 1st1 1st2)
  ; if set1 is empty then return an empty set ;
  (cond ((null? 1st1) '())
        ; if set2 is empty return and empty set ;
        ((null? 1st2) '())
        ; if the 1st element in set1 is in set2 then save it and continue checking the rest ;
        ((member? (car 1st1) 1st2)
         (cons (car 1st1) (intersect (cdr 1st1) 1st2)))
        ; if the 1st element in set1 isn't in set2 continue checking the rest ;
        (else (intersect (cdr 1st1) 1st2))))