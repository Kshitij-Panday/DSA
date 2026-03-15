import java.util.Arrays;

public class noFixedCol {
    public static void main(String[] args) {
        int [] [] arr = {
                {1,2,3,4,5},
                {1,2,3},
                {1}
        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
        System.out.println("Printing array with no fixed colomns using arrays.toString");
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        }
    }




