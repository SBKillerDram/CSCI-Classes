# Makefile for lab6.c
# Jermeiah Locke, CSCI112, lab6
# 2/27/12

lab6: lab6.o by_weight.o fig_drops_min.o fig_ml_hr.o get_kg_rate_conc.o get_problem.o get_rate_drop_factor.o get_units_conc.o by_units.o
	gcc -o lab6 lab6.o by_weight.o fig_drops_min.o fig_ml_hr.o get_kg_rate_conc.o get_problem.o get_rate_drop_factor.o get_units_conc.o by_units.o
lab6.o: lab6.c proto.h
	gcc -c lab6.c
by_weight.o: by_weight.c proto.h
	gcc -c by_weight.c
fig_drops_min.o: fig_drops_min.c proto.h
	gcc -c fig_drops_min.c
fig_ml_hr.o: fig_ml_hr.c proto.h
	gcc -c fig_ml_hr.c
get_kg_rate_conc.o: get_kg_rate_conc.c proto.h
	gcc -c get_kg_rate_conc.c
get_problem.o: get_problem.c proto.h
	gcc -c get_problem.c
get_rate_drop_factor.o: get_rate_drop_factor.c proto.h
	gcc -c get_rate_drop_factor.c
get_units_conc.o: get_units_conc.c proto.h
	gcc -c get_units_conc.c
by_units.o: by_units.c proto.h
	gcc -c by_units.c
