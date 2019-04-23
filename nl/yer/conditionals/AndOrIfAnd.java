package nl.yer.conditionals;

public class AndOrIfAnd {
    public static void main(String[] args) {
        int age = 60;
        double money = 10000;

        if(age>18){
            if(money>500){
                System.out.println("Welcome!");
            }
        }

//other way to do it is by using && (AndOrIfAnd)

        if(age>18 && money>500){
            System.out.println("Welcome!!");
        }
//way to use OR is by using ||

        if(age>18 || money>500){
            System.out.println("Also Welcome!");
        }
/* the NOT (!) logical operator is used to reverse logical state of its operand. if a condition is true,
the NOT logical operator will make it false
below reads as: if age is NOT greater than 18
 */
        if(!(age>18)){
            System.out.println("Too Young");
        }
        else{
            System.out.println("Welcome!!!");
        }
    }
}
