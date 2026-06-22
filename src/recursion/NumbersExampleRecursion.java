package recursion;

public class NumbersExampleRecursion {
  public static void main(String[] args) {
    print(1);
  }
  static void print(int n){
    if(n==5){
      System.out.println(5);
      return;
    }
    System.out.println(n);

    //recursive call
    //this is the last function call in the recursion
    //this is called tail recursion
    print(n+1);
  }

}
