package Patterns;

public class Q2 {
  public static void main(String[] args) {
    q2(4);
  }
  static void q2(int n){
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
