# Dekker's and Peterson's Algorithms - OS HW 2

Dekker's and Peterson's Algorithms are both two-thread mutual exclusion solutions.
To illustrate how each works the following simulation: The Cook (Thread 1) fills 
up a pot if it is empty. If the pot isn't empty the Savage (Thread 2) will eat one
portion from the pot. This will go on indefinitely. I'm going to pointing out the
important lines of the code.

``` java
class T {
    boolean t1WantsToEnter = false;
    boolean t2WantsToEnter = false;
    int favoredThread;
}

class Pot {
    public static int fullness;
}
```
Both found in the Main class. T holds the information of which 

## Dekker's Algorithm
Dekker's algorithm is the first solution to the critical section problem that works properly.
It guarantees mutual exclusion, and does not allow for deadlock of indefinite postponement, 
all things the previous generations had an issue with.
