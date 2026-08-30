package linkedLists;

import recursion.EzQuestions.Reverse;

public class ReverseLinkedList {
  private Node head;
  private Node tail;

  public void reverse(Node node){
    if (node == tail){
      head = tail;
      return;
    }
    reverse(node.next);
    tail.next=node;
    tail = node;
    tail.next = null;
  }
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
    public void insertFirst(int value) {

      Node newNode = new Node(value);

      newNode.next = head;
      head = newNode;

      if (tail == null) {
        tail = head;
      }


    }
  }
  
}

