package nl.yer.variables;

public class variables {

    public static void main(String[] args) {

    String name = "Lars";
    int age = 31;

    System.out.println(name);
    System.out.println(age);

    // possible to declare more than 1 variable to the specified type, see below (score)
    double score1 = 10.5, score2 = 15, score3 = 17.8;
    char groupnumber = 'A';
    boolean value = true;

    System.out.println(value);

    // math operators +, -, *, /, % modulo (denk aan klokrekenen)
    int day = 365 - 10;

    /* + operator adds 2 values: 2 constants, constant and a variable or variable and variable
    first: addition than substraction
     */
    int sum1 = 50 + 10;
    int sum2 = sum1 + 60;
    int sum3 = sum1 + sum2;
    int sum4 = 200 - 10;
    int sum5 = sum4 - sum3;
    int sum6 = sum5 - sum4;

    System.out.println(sum6);

    int numb = 23;
    int res = numb % 6;

    System.out.println(res);

    /* increment operators: x=x+1 --> ++x    x=x-1 --> --x
    */
    int test = 5;
    ++test; // test is now 6

    System.out.println(test);

    int test1 = 6;
    --test1; // test is now 5

    System.out.println(test1);

    /* prefix and postfix: increment and decrement operators; prefix: increments the variable value
    and uses the new value in the expression
     */

    int x = 2;
    int y = ++x; //turns in 3
    System.out.println(y);

    int x1 = 2;
    int y1 = x1++; //y1 turns into 2, x is first assigned to y and then incremented by one. x1 = 3
    System.out.println(x1);

    int a = 4;
    int b = 2;
    //a = a + b / a -= b; a = a - b
    a += b;
    a -= b;
    System.out.println(a);



    //Strings
    String naam1, naam2;
    naam1 = "Lars";
    naam2 = "Mariska";
    System.out.println("Our names are " + naam1 + " en " + naam2);


}}
