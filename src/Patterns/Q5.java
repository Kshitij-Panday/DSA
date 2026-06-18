package Patterns;

public class Q5 {
  public static void main(String[] args) {
    q5(5);
  }
  static void q5(int n){
    for (int i = 0; i < 2*n; i++) {
      int totalCols = i >n?2*n-i:i;
      for (int j = 0; j <totalCols ; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

}
