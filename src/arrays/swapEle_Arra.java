package arrays;

import java.util.Arrays;

public class swapEle_Arra {
    public static void main(String[] args) {
//        int[] arrays.arr = {1,2,3,4,5,6,7,8,9};
//        swap(arrays.arr,1,2);
//        System.out.println(Arrays.toString(arrays.arr));
//    }
//    static void swap(int[] array , int index1, int index2){
//        int temp = array[index1];
//        array[index1] = array[index2];
//        array[index2] = temp;

        // Printing max value from an array.
//        int [] arrays.arr = {1,10,30,45,340,568,2,4,7,9};
//        System.out.println(maxVal(arrays.arr));
//    }
//    static int maxVal(int[] arrays.arr){
//        int max = arrays.arr[0];
//        for (int i = 1; i <arrays.arr.length ; i++) {
//            if(arrays.arr[i]>max){
//                max=arrays.arr[i];
//            }
//        }
//          return max;

        int[] arr = {1, 3, 23, 9, 18, 56};
//        swap(arrays.arr, 0, 4);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }
//swamp fucntion
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}