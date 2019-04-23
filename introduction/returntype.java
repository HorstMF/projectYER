package introduction;

public class returntype {

    static int sum(int val1, int val2) {
        return val1 + val2;
    }

    public static void main(String[]args){
        int res = max(7, 42);
        System.out.println(res); //42 see below

        int x = sum(2, 5);
        System.out.println(x); //7 see above
    }

    static int max(int a, int b){
        if(a>b) {
            return a;
        }
        else {
            return b;
        }
    }
}
