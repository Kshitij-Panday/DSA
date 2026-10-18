package StackQueue.queue;



public class QueueUsingLL {

  private Node head;
  private Node tail;
  private int size;

  private class Node {
    int value;
    Node next;

    public Node(int value) {
      this.value = value;
    }
  }

  public QueueUsingLL() {
    this.size = 0;
  }

  public void add(int value) {
    Node node = new Node(value);

    if (tail == null) {
      head = tail = node;
    } else {
      tail.next = node;
      tail = node;
    }

    size++;
  }

  public int remove() {
    if (head == null) {
      System.out.println("Queue is empty");
      return -1;
    }

    int removed = head.value;
    head = head.next;

    if (head == null) {
      tail = null;
    }

    size--;
    return removed;
  }

  public int peek() {
    if (head == null) {
      System.out.println("Queue is empty");
      return -1;
    }

    return head.value;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public int size() {
    return size;
  }

  public void display() {
    Node temp = head;

    while (temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }

    System.out.println("END");
  }


  public static void main(String[] args) {
    QueueUsingLL queue = new QueueUsingLL();

    queue.add(10);
    queue.add(20);
    queue.add(30);

    queue.display();                  // [10, 20, 30]
    System.out.println(queue.peek()); // 10
    System.out.println(queue.remove()); // 10
    queue.display();                  // [20, 30]
    System.out.println(queue.size()); // 2
    System.out.println(queue.isEmpty()); // false
  }
}
