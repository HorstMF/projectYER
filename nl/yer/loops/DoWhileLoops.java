package nl.yer.loops;
/*
a do....while loop is similar to while loop: do...while loop is guaranteed to execute at least one time.
even with false condition, code will run once

the while is just the condition and doesn't have a body itself
 */
public class DoWhileLoops {
    public static void main(String[] args) {
        int x = 1;
        do {
            System.out.println(x);
            x++;
        }
        while(x<5);
// note: while is just condition and does nog have a body

        int y = 1;
        do {
            System.out.println(y);
            y++;
        }
        while(y<0);

    }

    }
