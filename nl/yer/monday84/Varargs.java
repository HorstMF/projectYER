package nl.yer.monday84;

public class Varargs {


    public int berekenMax(int eerste, int ... nummers) {
        int max = eerste;
        if (nummers.length > 1) {
            for (int i = 1; i < nummers.length; i++) {
                if (nummers[i] > max) {
                    max = nummers[i];
                }//else {continue}
            }
        }
        return max;
    }


    public static void main(String[] args) {
        Varargs testArgs = new Varargs ();

            System.out.println(testArgs.berekenMax(5));


        }
    }

