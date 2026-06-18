package Patterns;

public class Q3 {
  public static void main(String[] args) {
    q3(5);
  }
  static void q3(int n){
    for (int i = 1; i <=n; i++) {
      for (int j = n; j >= i ; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
