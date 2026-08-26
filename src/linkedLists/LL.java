package linkedLists;

public class LL {

  private Node head;
  private Node tail;
  private int size;

  public LL() {
    this.size = 0;
  }

  // Insert at beginning
  public void insertFirst(int value) {

    Node newNode = new Node(value);

    newNode.next = head;
    head = newNode;

    if (tail == null) {
      tail = head;
    }

    size++;
  }

  // Insert at any index
  public void insert(int value, int index) {

    if (index < 0 || index > size) {
      System.out.println("Invalid index");
      return;
    }

    if (index == 0) {
      insertFirst(value);
      return;
    }

    if (index == size) {
      insertLast(value);
      return;
    }

    Node temp = head;

    for (int i = 1; i < index; i++) {
      temp = temp.next;
    }

    Node newNode = new Node(value, temp.next);

    temp.next = newNode;

    size++;
  }

  // Insert at end
  public void insertLast(int value) {

    Node newNode = new Node(value);

    if (tail == null) {
      head = newNode;
      tail = newNode;
      size++;
      return;
    }

    tail.next = newNode;
    tail = newNode;

    size++;
  }

  // Insert using recursion
  public void insertRec(int value, int index) {

    if (index < 0 || index > size) {
      System.out.println("Invalid index");
      return;
    }

    head = insertRec(value, index, head);

    // If inserted at the end, update tail
    if (index == size - 1) {
      tail = get(size - 1);
    }
  }

  private Node insertRec(int value, int index, Node node) {

    if (index == 0) {

      Node temp = new Node(value, node);

      size++;

      return temp;
    }

    node.next = insertRec(value, index - 1, node.next);

    return node;
  }

  // Delete first element
  public int deleteFirst() {

    if (head == null) {
      System.out.println("List is empty");
      return -1;
    }

    int value = head.value;

    head = head.next;

    if (head == null) {
      tail = null;
    }

    size--;

    return value;
  }

  // Delete last element
  public int deleteLast() {

    if (size <= 1) {
      return deleteFirst();
    }

    Node secondLast = get(size - 2);

    int value = tail.value;

    tail = secondLast;
    tail.next = null;

    size--;

    return value;
  }

  // Delete element at index
  public int deleteAtIndex(int index) {

    if (head == null) {
      System.out.println("List is empty");
      return -1;
    }

    if (index < 0 || index >= size) {
      System.out.println("Invalid index");
      return -1;
    }

    if (index == 0) {
      return deleteFirst();
    }

    if (index == size - 1) {
      return deleteLast();
    }

    Node prevNode = get(index - 1);

    int value = prevNode.next.value;

    prevNode.next = prevNode.next.next;

    size--;

    return value;
  }

  // Get node at index
  public Node get(int index) {

    if (index < 0 || index >= size) {
      return null;
    }

    Node node = head;

    for (int i = 0; i < index; i++) {
      node = node.next;
    }

    return node;
  }

  // Find node by value
  public Node findByValue(int value) {

    Node node = head;

    while (node != null) {

      if (node.value == value) {
        return node;
      }

      node = node.next;
    }

    return null;
  }

  // Display linked list
  public void display() {

    Node temp = head;

    while (temp != null) {

      System.out.print(temp.value + " -> ");

      temp = temp.next;
    }

    System.out.println("END");
  }

  private void bubbleSort(int row, int col) {
    if (row == 0) {
      return;
    }

    if (col < row) {
      Node first = get(col);
      Node second = get(col + 1);

      if (first.value > second.value) {
        // swap
        if (first == head) {
          head = second;
          first.next = second.next;
          second.next = first;
        } else if (second == tail) {
          Node prev = get(col - 1);
          prev.next = second;
          tail = first;
          first.next = null;
          second.next = tail;
        } else {
          Node prev = get(col - 1);
          prev.next = second;
          first.next = second.next;
          second.next = first;
        }
      }
      bubbleSort(row, col + 1);
    } else {
      bubbleSort(row - 1, 0);
    }
  }

  // Node class
  private class Node {

    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }
}