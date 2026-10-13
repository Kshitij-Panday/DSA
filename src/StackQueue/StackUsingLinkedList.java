package StackQueue;
class Node{
  int val;
  Node next;

  Node(int val){
    this.val = val;
  }
}
class MyStack{
  Node head;
  int len;
  int peek(){
    if (head == null){
      System.out.println("Stack is Empty");
      return -1;
    }
    return head.val;
  }
  int pop(){
    if (head == null){
      System.out.println("Stack is Empty");
      return -1;
    }
    int x = head.val;
    head = head.next;
    len--;
    return x;
  }
  void push(int val){
    Node temp = new Node(val);
    if (len == 0){
      head = temp;
    }
    else {
      temp.next = head;
      head = temp;
    }
    len++;
  }
  int size(){
    return len;
  }
  void display(){
    Node temp = head;
    while(temp!=null){
      System.out.println(temp.val);
      temp = temp.next;
    }
    System.out.println();
  }

}
public class StackUsingLinkedList {
  public static void main(String[] args) {
    MyStack stack = new MyStack();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    stack.push(50);
    stack.display();
  }
}
