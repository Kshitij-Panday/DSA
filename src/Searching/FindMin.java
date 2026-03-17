package Searching;

public class FindMin {
    public static void main(String[] args) {
int[] arr = {2335,42,53456,7789,765,432,345,67,45};
int ans = min(arr);
        System.out.println(ans);
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
            return ans;
    }
}
