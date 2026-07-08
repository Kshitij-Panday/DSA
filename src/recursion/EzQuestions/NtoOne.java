package recursion.EzQuestions;

public class NtoOne {
  public static void main(String[] args) {
    func(5);
    System.out.println("---------------------");
    funcReverse(5);
  }
  static void func(int n){
    if(n == 0){
      return;
    }
    func(n-1);
    System.out.println(n);
  }
  static void funcReverse(int n){
    if(n == 0){
      return;
    }
    System.out.println(n);
    funcReverse(n-1);

  }
}
