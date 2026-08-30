package StackQueue.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInBuiltExample {
  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();
    deque.add(10);
    deque.add(20);
    deque.addLast(30);

    deque.removeFirst();
  }
}
