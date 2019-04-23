package nl.yer.loops;
/*
break and continue statemenst change the loop's execution flow
break: terminates the loop, transfers execution to statement immediately following the loop
 */
public class LoopControlStatements {
    public static void main(String[] args) {
        int x = 1;

        while(x>0){
            System.out.println(x);
            if(x==4) {
                break;
            }
            x++;
            }

        String enter = "Next loop with continue statement";
        System.out.println(enter);

        /*
        continue statement: makes the loop skip to its next iteration
         */

        for(int z =10;z<=40;z=z+10){
            if(z==30){
                continue;
            }
            System.out.println(z); //skips value of 30

        }
    }
    }

