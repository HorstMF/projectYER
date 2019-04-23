package nl.yer.loops;

public class WhileLoops {
    public static void main(String[] args) {
        int x = 3;
//repeats itself over en over till it is no more >0, prints: 3,2,1
        while(x>0) {
            System.out.println(x);
            x--;
        }

        String enter = "next while below";
        System.out.println(enter);

 //when the result is false (by x=10) loop body will be skipped and first statement after loop is executed
        while (x<10) {
        System.out.println(x);
        x++;
        }
        System.out.println("Loop ended");



    }
    }
