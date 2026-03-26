package Searching;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int []arr = {90,88,65,34,23,12,11,10,8,5,3,2,1};
        int target = 1;
        int ans = OrderAgnosticBs(arr,target);
        System.out.println(ans);
    }

    static int OrderAgnosticBs(int [] arr , int target ){
        int start = 0;
        int end = arr.length-1;

        // find whether the array sorted in ascending order or descending order.
        boolean isAscen;
        if (arr[start] < arr [end]){
            isAscen = true;
        }
        else{
            isAscen= false;
        }
        while (start<= end){
            int mid = (start + (end -start)/2);

            if(arr[mid] == target){
                return mid;
            }
            if(isAscen) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }


        }
        return -1;
    }


}
