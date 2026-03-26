package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {-18,-12,-4,1,2,3,4,5,6,6,7,8,8,9,122,456,678,9876};
        int target = 122;
        int ans = search(arr,target);
        System.out.println(ans);
    }


static int search(int [] arr , int target){
    int start = 0;
    int end = arr.length-1;

    while (start<= end){
        int mid = (start + (end -start)/2);
        if(target < arr[mid]){
            end = mid -1;
        }
        else if (target> arr[mid]) {
            start = mid+1;
        }
        else {
            return mid;
        }


    }
return -1;
}
}