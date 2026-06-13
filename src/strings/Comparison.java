package strings;

public class Comparison {
  public static void main(String[] args) {
    String a = "Kshitij";
    String b = "Kshitij";

    System.out.println(a == b);


    String name1 = new String("Kshitij");
    String name2 = new String("Kshitij");
    System.out.println(name1 == name2);
    System.out.println(name1.equals(name2));
    System.out.println(name1.charAt(0));
    System.out.println(name1.charAt(3));
    System.out.println(name1.charAt(6));

  }
}
