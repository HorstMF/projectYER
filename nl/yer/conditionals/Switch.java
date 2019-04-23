package nl.yer.conditionals;

/* you can have any number of case statements within a switch. each case is followed by the comparison value
and a colon
 */

public class Switch {
    public static void main(String[] args) {
         int day = 7;

         switch(day){
             case 1:
                 System.out.println("Monday");
                 break;
             case 2:
                 System.out.println("Tuesday");
                 break;
             case 3:
                 System.out.println("Wednesday");
                 break;
         }

         switch(day){
             case 4:
                 System.out.println("Thursday");
                 break;
             case 5:
                 System.out.println("Friday");
                 break;
             case 6:
                 System.out.println("Saturday");
                 break;
             default: //default if there is no match, this will be the output
                 System.out.println("Weekday");
         }
    }

}
