package linkedLists;

public class CLL {
private Node head;
private Node tail;

public void insert(int value){
  Node newNode = new Node(value);
  if (head == null){
    head =newNode;
    tail = newNode;
  }
  tail.next = newNode;
  newNode.next = head;
  tail = newNode;
}

public void display(){
  Node node = head;
  if (head != null){
    do{
      System.out.print(node.value + " ->");
      node = node.next;
    }
    while(node != head);

  }
  System.out.println(" HEAD");
}

public void delete(int value){
  Node newNode = head;
  if (newNode == null){
    return;
  }
  if (newNode.value == value){
    head = head.next;
    tail.next = head;
    return;
  }

  do{
    Node n = newNode.next;
    if (n.value == value){
      newNode.next = n.next;
      break;
    }
    newNode=newNode.next;

  }while(newNode != head);

}

  private class Node{
    private int value;
    private Node next;

    Node(int value){
      this.value = value;
    }
    Node (int value,Node next){
      this.value = value;
      this.next= next;
    }
  }
}
