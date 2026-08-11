package recursion.EzQuestions;

public class PowerOfTwo {

  public static int calculatePowerOfTwo(int n) {

    if (n == 0) {
      return 1;
    }

    return 2 * calculatePowerOfTwo(n - 1);
  }

  public static void main(String[] args) {
    int exponent = 5;
    int result = calculatePowerOfTwo(exponent);
    System.out.println("2^" + exponent + " = " + result);
  }
}
