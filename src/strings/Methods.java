package strings;
import java.util.Arrays;
public class Methods {
  public static void main(String[] args) {
    String name = "Kshitij Panday Hello World";
    System.out.println(Arrays.toString(name.toCharArray()));
    System.out.println(name.toLowerCase());
    System.out.println(name.toUpperCase());
    System.out.println(name.replace('i',  'f' ));
    System.out.println(name);
    System.out.println(name.indexOf('a'));
    System.out.println("     Panday   ".strip());
    System.out.println(Arrays.toString(name.split(" ")));
  }
}
