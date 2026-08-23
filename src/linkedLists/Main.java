package linkedLists;

public class Main {
  public static void main(String[] args) {
    LL ll = new LL();
    ll.insertFirst(10);
    ll.insertFirst(20);
    ll.insertFirst(30);
    ll.insertFirst(40);
    ll.insertLast(69);
    ll.insert(100,2);
    ll.display();
    System.out.println(ll.deleteFirst() + " Was removed");
    System.out.println("Updated list:");
    ll.display();
    System.out.println(ll.deleteLast() + " Was Removed");
    ll.display();
    System.out.println(ll.deleteAtIndex(2) + " Was removed");
    ll.display();
    ll.findByValue(30);
  }
}
