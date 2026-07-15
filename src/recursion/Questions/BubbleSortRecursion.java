package recursion.Questions;

import java.util.Arrays;

public class BubbleSortRecursion {
  public static void main(String[] args) {
int[] arr ={2,3,4,5,};
Bubble(arr,arr.length-1,0);
    System.out.println(Arrays.toString(arr));
  }
  static void Bubble(int [] arr,int row , int col){
    if(row == 0){
      return;
    }
    if(col < row){
if(arr[col] > arr[col+1]){
  int temp = arr[col];
  arr[col] = arr[col+1];
  arr[col+1] = temp;
}
      Bubble(arr,row,col+1);
    }
    else{

      System.out.println();
      Bubble(arr,row-1,0);
    }
  }
}
