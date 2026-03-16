package basics;

import java.util.Scanner;

public class method {
    public static void main(Stringeg[] args) {
        int ans = sum();
        System.out.println(ans);
    }
    static int sum(){
        Scanner input = new Scanner((System.in));
        System.out.println("Enter first number: ");
        int num1= input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        int sum = num1+num2;
        return sum; // return means that the basics.method is over it is the last line nothing will work after this.
    }
}
