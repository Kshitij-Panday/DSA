package linkedLists;

public class LL {

  private Node head;
  private Node tail;

  private int size;
  public LL(){
    this.size = 0;
  }

    public void insertFirst(int value){
    Node newNode = new Node(value);
    newNode.next = head;
    head = newNode;

    if (tail == null){
      tail = head;
    }
    size += 1;
    }

    public void insert(int value,int index){
    if (index > size){
      System.out.println("Index exceeds list size");
      return;
    }
    if (index == 0){
      insertFirst(value);
      return;
    }
    if (index == size){
      insertLast(value);
      return;
    }
    Node temp = head;
      for (int i = 1; i < index; i++) {
        temp= temp.next;
      }
  Node newNode = new Node(value,temp.next);
      temp.next= newNode;
     size++;
    }

    public void insertLast(int value){
    Node newNode = new Node(value);

    if (tail == null){
      insertFirst(value);
      return;
    }
    tail.next = newNode;
    tail = newNode;
    size++;
    }

    public int deleteFirst() {
      int value = head.value;
      head = head.next;
      if (head == null){
        tail = null;
      }
      size--;
      return value;
    }

    public int deleteLast(){
    if (size<= 1){
      return deleteFirst();
    }
    Node secondLast = get(size-2);
    int value = tail.value;
    tail = secondLast;
    tail.next = null;
    size--;
    return value;
    }
    public int deleteAtIndex(int index){
    if ( index == 0){
      return deleteFirst();
    }
    if (index == size-1){
      return deleteLast();
    }
    Node prevNode = get(index-1);
    int value = prevNode.next.value;

    prevNode.next = prevNode.next.next;
    size--;
    return value;
    }

    public Node get(int index){
    Node node = head;
      for (int i = 0; i < index; i++) {
        node = node.next;
      }
       return node;
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

    public void display(){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.value + "->");
      temp = temp.next;
    }
      System.out.println("END");
    }
  private class Node{
    private int value;
    private Node next;

  public Node(int value){
    this.value = value;
    }
    public Node(int value, Node next){
      this.value = value;
      this.next = next;
  }
  }

}
