package linkedLists;

public class Main {

  public static void main(String[] args) {

    LL ll = new LL();

    ll.insertFirst(10);
    ll.insertFirst(20);
    ll.insertFirst(30);
    ll.insertFirst(40);

    ll.insertLast(69);

    ll.insert(100, 2);

    System.out.println("Original list:");
    ll.display();

    System.out.println(ll.deleteFirst() + " Was removed");

    System.out.println("Updated list:");
    ll.display();

    System.out.println(ll.deleteLast() + " Was removed");

    System.out.println("Updated list:");
    ll.display();

    System.out.println(ll.deleteAtIndex(2) + " Was removed");

    System.out.println("Updated list:");
    ll.display();

    if (ll.findByValue(30) != null) {
      System.out.println("30 found");
    } else {
      System.out.println("30 not found");
    }

    ll.insertRec(8080, 2);

    System.out.println("After recursive insertion:");
    ll.display();
  }
}