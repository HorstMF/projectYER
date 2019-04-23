package introduction;

public class helloworld {

    static void sayHello() {
        System.out.println("Hello World!");
    }

    static void sayHi(String name) {
        System.out.println("Hello " + name);
    }

    static int sum(int val1, int val2) {
        return val1 + val2;
    }

    /*
    method returns to a value, we can assign it to a variable.
    when you do not need to return from your method: use void
    void: in main method --> does not return anything
    public static void main(String[] args): main method takes an array of Strings as its parameters, does not return
    a value

     */
    public static void main(String[] args) {
        sayHello();
        sayHello();
        sayHello();
        sayHi("David");
        sayHi("Amy");
        int x = sum(2, 5);
        System.out.println(x);

        String Name = "Hello Jeroen";
        System.out.println(Name);

        int G = 4;
        square(G);
        System.out.println(G);
    }

    static void square(int G){
        G = G * G;
    }





/*
in cases like above repeating same thing over and over: using loops (while or for)

 */
}
