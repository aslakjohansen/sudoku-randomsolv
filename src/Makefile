TARGETS = \
	RandomSolver.class \

CLASSPATH = ../../sudoku-solver-harness/src:.

all: ${TARGETS}

clean:
	touch ${TARGETS}
	rm    ${TARGETS}

mrproper: clean
	touch d~
	rm    *~


RandomSolver.class: RandomSolver.java
	CLASSPATH=${CLASSPATH} javac RandomSolver.java

RandomSolver: RandomSolver.class
	CLASSPATH=${CLASSPATH} java RandomSolver

