package strings;

import java.util.ArrayList;

public class Operators {
  public static void main(String[] args) {
    System.out.println('a' + 'b'); //adds the ASCII value that is a = 97 and b  = 98 therefore 97+98 = 195.
    System.out.println("a"+"b"); //strings don't get converted to ASCII only char are converted to ASCII.
    System.out.println('a'+3); //97 + 3 = 100
    System.out.println((char)('a'+3));
    System.out.println("Kshitij"+ new ArrayList<>());
    System.out.println("Kshitij" + new Integer(56));
    String ans = new Integer(56) + "" + new ArrayList<>();
    System.out.println(ans);
  }
}
