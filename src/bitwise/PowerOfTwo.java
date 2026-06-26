package bitwise;

public class PowerOfTwo {
  public static void main(String[] args) {
    int n = 32; //0 is a exception case so return false if n ==0;
    boolean ans = (n & (n-1)) == 0;
    System.out.println(ans);
  }
}
