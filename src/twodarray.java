import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;
import java.util.Scanner;
public class twodarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] [] arr = new int[3][3] ;
//        arr[0] [0]= 1;
//        arr[0] [1]= 2;
//        arr[0] [2]= 3;
//        arr[1] [0]= 4;
//        arr[1] [1]= 5;
//        arr[1] [2]= 6;
//
//        System.out.println(Arrays.toString(arr[0]));

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//                System.out.println(" ");
        //printing using Arrays.toString
//        for (int row = 0; row < arr.length; row++) {
//        System.out.println(Arrays.toString(arr[row]));
//        }

        //enhanced for loop
        for(int[] a : arr){
            System.out.println(Arrays.toString((a)));
        }
    }
}




