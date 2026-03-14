
import java.util.Arrays;
import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
//  int[] arr = new int[5];
//    System.out.println(arr[0]);
//    String[] arr2 = new String[5];
//        System.out.println(arr2[0]);
        Scanner input = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0]=23;
//        arr[1]=45;
//        arr[2]=46;
//        arr[3]=47;
//        arr[4]=48;
        //System.out.println(arr[3]);

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Array Elements :"+" " + arr[i]);
//        }
//
//        //advanced for loop
//        for( int num : arr){
//            System.out.println(num+" ");
//        }
//        System.out.println(Arrays.toString(arr));
//
//        String[] arr = new String[4];
//        for (int i = 0; i < arr.length; i++) {
//        arr[i] = input.next();
//        }
//            System.out.println(Arrays.toString(arr));
//
//        arr[1] = "Kshitij";
//        System.out.println(Arrays.toString(arr));

        String[] nums = new String[4];
        for (int i = 0; i < nums.length; i++) {
            nums[i]= input.next();
        }
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(String[] shimlal){
        shimlal[3] = "Kshitij";
    }
}


