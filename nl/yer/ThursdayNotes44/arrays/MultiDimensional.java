package nl.yer.ThursdayNotes44.arrays;

/*
array's two indexes are called row index and column index (table)

arrays can be nested within arrays to as many levels as your program needs. need to declare an array with more than
2 dimensions, add as many sets of empty brackets as you need.
all array members must be of the same type
 */

public class MultiDimensional {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}}; //declares an array with 2 arrays as its elements
        int x = matrix[1][0]; //one for the array & one for the element inside that array
        System.out.println(x); //output 4


        int[][] matrix1 = {{1,2,3},{4},{5,6,7}}; //2D with 3 arrays - not limited to just 2D arrays
        matrix1[0][2] = 42;
        int y = matrix1[0][2]; //output 42
        System.out.println(y);


        int arr[] = new int[3];
        for (int i=0; i<3; i++) {
            arr[i] = i;
        }
        int res = arr[0] + arr[2];
        System.out.println(res); //output 2

        }



    }

