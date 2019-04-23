package nl.yer.loops;
/*
for loops syntax:
for(initialization; condition; increment/decrement){
statement(s)
}
initialization: expression executes only once during the beginning of the loop
condition: evaluated each time the loop iterates. loop executes the statement repeatedly until this condition returns
false.
increment/decrement: executes after each iteration of the loop
 */

//below example printing loop 1 through 5

public class ForLoop {
    public static void main(String[] args) {
        for(int x = 1;x<=5;x++){
            System.out.println(x);
        }

        String enter = "Below is shown the next loop";
        System.out.println(enter);

//loop 10 till 1, starting at 10, stops when x=1 or >1, every step minus 1

        for(int x= 10;x>=1;x--){
            System.out.println(x);
        }
    }
    /* a for loop is best when starting and ending numbers are known */
}
