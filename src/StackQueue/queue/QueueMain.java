package StackQueue.queue;

public class QueueMain {
  public static void main(String[] args) throws Exception {
//    CustomQueue queue = new CustomQueue();
      CircularQueue queue = new CircularQueue();
    queue.insert(10);
    queue.insert(20);
    queue.insert(30);
    queue.insert(40);
    queue.insert(50);
    queue.display();
    System.out.println("Removed "+queue.remove());
    queue.insert(100);
    queue.display();
  }
}
