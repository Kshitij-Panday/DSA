package basics;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        int n = input.nextInt();
        boolean ans = isPrimee(n);
        System.out.println(ans);
    }
    static boolean isPrimee( int number){
        if (number<=1){
            return false;
        }
        else {
            int c =2;
            while(c*c<=number){
                if( number %c == 0){
                    return false;
                }
                c++;
            }
            if (c*c >=1){
                return true;
        }
            else{
                return false;
            }

        }
    }
}
