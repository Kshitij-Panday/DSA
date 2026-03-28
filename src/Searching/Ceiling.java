package Searching;

public class Ceiling {   // also fixed class name (capital C)

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,7,7,8,9,11,45,67,78,98};
        int target = 11;

        int ans = ceilingSearching(arr, target);
        System.out.println(ans);
    }


    static int ceilingSearching(int[] arr, int target) {
        if (target > arr.length-1){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}