package sorting;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int [] arr = {2,5,8,7,9,3,11,6};
    bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
  }
  static void bubbleSort(int[] arr){
    boolean swapped;
    for (int i = 0; i < arr.length; i++) {
swapped = false;
      //for each step max item will come at last respective index
      for (int j = 1; j <= arr.length-i-1; j++) {
        //swap if the item is smaller than the previous item
        if (arr[j]<arr[j-1]){
          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;
          swapped = true;
        }
if(!swapped){
  break;
}
      }
    }
  }
}
