package linkedLists;

import java.util.LinkedList;

public class InternalLinkedList {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(34);
    list.add(69);
    list.add(70);

    System.out.println(list);
    list.remove(2);
    System.out.println(list);
    list.addLast(6969);
    list.addFirst(420);
    System.out.println(list);

  }
}
