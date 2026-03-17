package Searching;

public class searchInRange {
    public static void main(String[] args) {
        int [] nums = {12,15,36,85,253,843,3456,747,57,36,8,157,57,4,8,9,10};
        int target = 843;
        int start = 3;
        int end = 5;
        int ans = LinearSearching(nums, target, start, end);
        System.out.println(ans);
    }
    static int LinearSearching(int [] arr , int target, int start , int end){
        if(arr.length == 0){
            return -1;
        }

        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if(element == target){
                return i;

            }

        }
        return -1;
    }

}
