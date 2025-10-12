import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        System.out.println("enter the number which you want to search:");
        Scanner input = new Scanner(System.in);
        int [] arr={-18,-12,-4,0,2,3,5,7,9,15,20,22,23,24,25,26};
        int target = input.nextInt();
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid= start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;


            }
            else {
                return mid;
            }

        }
        return -1;
    }

}
