#######################################################################
#    Copyright 2011 Oscar Amoros Huguet, Cristian Garcia Marin
#
#   This file is part of SimpleOpenCL
#
#    SimpleOpenCL is free software: you can redistribute it and/or modify
#    it under the terms of the GNU General Public License as published by
#    the Free Software Foundation, version 3.
#
#    SimpleOpenCL is distributed in the hope that it will be useful,
#    but WITHOUT ANY WARRANTY; without even the implied warranty of
#    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
#    GNU General Public License for more details.
#
#   You should have received a copy of the GNU General Public License
#   along with SimpleOpenCL. If not, see <http://www.gnu.org/licenses/>.
#
####################################################################### 
#   SimpleOpenCL Version 0.09_01_10_2011 

HOME    = $(PWD)
EXEC    = $(HOME)/test
CC      = gcc
SRC = code.c simpleCL.c gambleStdlib.c
CFLAGS  = -Wall -Wextra -pedantic -O3 -std=c99

UNAME := $(shell uname)

ifeq ($(UNAME), Linux)
INCL_P  = -I$(HOME)/inc -I/usr/local/cuda/include
LIBS   = -lm -lOpenCL -lrt
INCL_AMD = -I$(HOME)/inc -I/opt/AMDAPP/include
LIBS_AMD = -L/opt/AMDAPP/lib/x86_64 $(LIBS)
CFLAGS_AMD  = $(CFLAGS) -DATI_OS_LINUX
endif
ifeq ($(UNAME), Darwin)
INCL_P   = -I$(HOME)/inc
LIBS     = -framework OpenCL
INCL_AMD = $(INCL_P)
LIBS_AMD = $(LIBS)
CFLAGS_AMD = $(CFLAGS)
endif

all:
	$(CC) $(CFLAGS) $(INCL_P) -c $(SRC)
	$(CC) $(CFLAGS) *.o -o $(EXEC) $(LIBS)
	rm -f *.o

amd:

	$(CC) $(CFLAGS_AMD) -c $(SRC) $(INCL_AMD)
	$(CC) $(CFLAGS) *.o -o $(EXEC) $(LIBS_AMD)
	rm -f *.o

clean:
	rm -f *.o $(EXEC)

cleanbin:
	rm -f snapshot* image*