package basics;

public class Stringeg {
    public static void main(String[] args) {
    String ans = word();
        System.out.println(ans);
      int ans1 =   sum3(4, 5);
        System.out.println(ans1);
    }
    static String word(){
        String greeting = "How are you";
                return greeting;
    }

    static int sum3(int a ,int b){
        int sum = a+b;
        return sum;
    }
}
