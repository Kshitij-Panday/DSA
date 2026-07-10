package recursion.Questions;

import java.util.ArrayList;

public class LinearSearch {
  public static void main(String[] args) {
    int [] arr = {1,2,3,4,4,5,6,7,8,10};
    int target = 8;
    System.out.println(Find(arr, target, 0));
    System.out.println(Find1(arr, target, 0));
    System.out.println(findIndexLast(arr, 4, arr.length-1));
    ArrayList<Integer> ans = findAllIndex(arr, 4, 0, list);
        System.out.println(ans);
    System.out.println(findAllIndex2(arr, 4, 0));
  }
  static boolean Find(int [] arr,int target,int index){
    if(index == arr.length){
      return false;
    }
    return arr[index] == target || Find(arr, target, index+1);
  }
  static int Find1(int [] arr,int target,int index){
    if(index == arr.length){
      return -1;
    }

    if(target == arr[index]){
      return index;
    }
    else
       return Find1(arr, target, index+1);

  }
  static int findIndexLast(int[] arr, int target, int index) {
    if (index == -1) {
      return -1;
    }
    if (arr[index] == target) {
      return index;
    } else {
      return findIndexLast(arr, target, index - 1);
    }
  }

  static ArrayList<Integer> list = new ArrayList<>();
  static void findAllIndex(int[] arr, int target, int index) {
    if (index == arr.length) {
      return;
    }
    if (arr[index] == target) {
      list.add(index);
    }
    findAllIndex(arr, target, index + 1);
  }

  static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
    if (index == arr.length) {
      return list;
    }
    if (arr[index] == target) {
      list.add(index);
    }
    return findAllIndex(arr, target, index + 1, list);
  }

  static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

    ArrayList<Integer> list = new ArrayList<>();

    if (index == arr.length) {
      return list;
    }

    // this will contain answer for that function call only
    if (arr[index] == target) {
      list.add(index);
    }
    ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

    list.addAll(ansFromBelowCalls);

    return list;
  }

}
