package Searching;

public class LinearSearch {
    public static void main(String[] args) {
int [] nums = {12,15,36,85,253,843,3456,747,57,36,8,157,57,4,8,9,10};
int target = 10;
int ans = LinearSearching(nums, target);
        System.out.println(ans);
    }

    static int LinearSearching(int [] arr , int target){
        if(arr.length == 0){
            return -1;
        }

            for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
               if(element == target){
                   return i;

               }

            }
      return -1;
    }

}
