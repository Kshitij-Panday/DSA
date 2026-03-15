package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
//  int[] arrays.arr = new int[5];
//    System.out.println(arrays.arr[0]);
//    String[] arr2 = new String[5];
//        System.out.println(arr2[0]);
        Scanner input = new Scanner(System.in);
//        int[] arrays.arr = new int[5];
//        arrays.arr[0]=23;
//        arrays.arr[1]=45;
//        arrays.arr[2]=46;
//        arrays.arr[3]=47;
//        arrays.arr[4]=48;
        //System.out.println(arrays.arr[3]);

//        for (int i = 0; i < arrays.arr.length; i++) {
//            arrays.arr[i] = input.nextInt();
//        }
//        for (int i = 0; i < arrays.arr.length; i++) {
//            System.out.println("Array Elements :"+" " + arrays.arr[i]);
//        }
//
//        //advanced for loop
//        for( int num : arrays.arr){
//            System.out.println(num+" ");
//        }
//        System.out.println(Arrays.toString(arrays.arr));
//
//        String[] arrays.arr = new String[4];
//        for (int i = 0; i < arrays.arr.length; i++) {
//        arrays.arr[i] = input.next();
//        }
//            System.out.println(Arrays.toString(arrays.arr));
//
//        arrays.arr[1] = "Kshitij";
//        System.out.println(Arrays.toString(arrays.arr));

        String[] nums = new String[4];
        for (int i = 0; i < nums.length; i++) {
            nums[i]= input.next();
        }
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(String[] shimlal){
        shimlal[3] = "Kshitij";
    }
}


