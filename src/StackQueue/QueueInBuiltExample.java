package StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInBuiltExample {
  public static void main(String[] args) {


  Queue<Integer> queue = new LinkedList<>();
  queue.add(3);
  queue.add(6);
  queue.add(9);
  queue.add(12);
  queue.add(15);
  queue.add(18);

    System.out.println(queue.peek());
    System.out.println("Removed : "+queue.remove() );
    System.out.println(queue.peek());
}
}
