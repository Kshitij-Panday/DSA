package linkedLists;

public class DLL {

  private Node head;

  public void insertFirst(int value) {
    Node newNode = new Node(value);

    newNode.next = head;
    newNode.prev = null;

    if (head != null) {
      head.prev = newNode;
    }

    head = newNode;
  }

  public void insertLast(int value) {
    Node newNode = new Node(value);

    if (head == null) {
      newNode.prev = null;
      head = newNode;
      return;
    }

    Node node = head;

    while (node.next != null) {
      node = node.next;
    }

    node.next = newNode;
    newNode.prev = node;
    newNode.next = null;
  }

  public void display() {
    Node node = head;
    Node last = null;

    while (node != null) {
      System.out.print(node.value + "->");
      last = node;
      node = node.next;

    }
    System.out.println("END");

    System.out.println("Printing in reverse");
    while(last != null){
      System.out.print(last.value+"->");
      last = last.prev;
    }
    System.out.println("START");
  }

  public Node findByValue(int value){
    Node node = head;
    while(node != null){
      if (node.value == value){
        return node;
      }
      node = node.next;
    }
    return null;
  }

  public void insert(int after,int value){
    Node p = findByValue(after);
    if (p == null){
      System.out.println("Node doesn't exist");
      return;
    }
    Node newNode = new Node(value);
    newNode.next = p.next;
    p.next = newNode;
    newNode.prev = p;
    if (newNode.next != null){
    newNode.next.prev = newNode;
  }
  }

  private class Node {
    private int value;
    private Node next;
    private Node prev;

    private Node(int value) {
      this.value = value;
    }

    private Node(int value, Node next, Node prev) {
      this.value = value;
      this.next = next;
      this.prev = prev;
    }
  }
}