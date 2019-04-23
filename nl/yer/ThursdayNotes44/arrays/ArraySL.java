package nl.yer.ThursdayNotes44.arrays;

/*
in an array: elements are ordered and has specific and constant position --> index
to reference elements in an array: type name of array followed by index position within []
array starts counting from 0
 */
public class ArraySL {
    public static void main(String[] args) {
        int[] array = new int[5]; //define arrays capacity with 5

        String[] Names = {"Bennie", "Hennie", "Jennie", "Lennie"};
        System.out.println(Names[3]); //output Lennie

        int[] intArr = new int[5];
        System.out.println(intArr.length); //output 5 by using length

        /*
        note: indexes start from 0: above last index is 4.
         */

        /*
        calculate the sum of all elements in an array by using loops
        for loop is most used loop for working with arrays --> use length of the array to determine how many times
        to run the loop
         */

        int [] myArray = {6, 42, 3, 7};
        int sum=0;
        for(int x=0; x<myArray.length; x++){
            sum += myArray[x];
        }
        System.out.println(sum); //58

        /*
        enhanced for loop (for each loop): traverse elements in arrays
        eliminates possibility of bugs and make the code easier to read
         */

        /*
        variable will be available within the for block, value will be the same as the current array element.
        on each iteration of the loop, the variable t will be equal to the corresponding element in the array
         */

        int[] primes = {2, 3, 5, 7};

        for(int x: primes){
            System.out.println(x); //2,3,5,7
        }


    }
}
