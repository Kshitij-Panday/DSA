package recursion.EzQuestions;

public class Factorial {
  public static void main(String[] args) {
    System.out.println(fact(5));
  }
  static int fact(int n){
    if(n <= 1){
      return 1; // since factorial of 1 and 0 is 1 .
    }
     return n * fact(n-1);
  }
}
