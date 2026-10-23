package binaryTrees;

import java.util.LinkedList;
import java.util.Queue;

class Node{
  int val;
  Node left;
  Node right;

  Node(int val){
    this.val = val;
  }
}

class Pair{
  Node node;
  int level;

  Pair(Node node , int level){
    this.node = node;
    this.level = level;
  }
}
public class Implementation {
  public static void main(String[] args) {
    Node a = new Node(3);
    Node b = new Node(4);
    Node c = new Node(2);
    Node d = new Node(-1);
    Node e = new Node(1);
    Node f = new Node(6);
    Node g = new Node(9);

    a.left = b; a.right = c;
    b.left = d; b.right = e;
    c.left = f; c.right = g;

    display(a);
    System.out.println();
    System.out.print("Size of the Tree : ");
    System.out.println(size(a));

    System.out.print("Sum of the Tree is : ");
    System.out.println(sum(a));

    System.out.print("Product of the Tree is : ");
    System.out.println(product(a));

    System.out.print("Maximum Value of the Tree is : ");
    System.out.println(maximum(a));

    System.out.print("Levels of the Tree is : ");
    System.out.println(levels(a));

    System.out.println("Level Order Traversal of the Tree");
    levelOrderTraversal(a);

    System.out.println("level Order Traversal Level Wise of the Tree");
    levelOrderTraversalLevelWise(a);
  }

  private static int size(Node root) {
    if (root ==null) return 0;
    return 1+size(root.left)+size(root.right);
  }


  private static int sum(Node root){
    if (root == null) return 0; //we are returning zero for additive identity as when the root is null we want to put 0 in the plade of the sum(root.left) and root.right calls.
  return root.val+sum(root.left)+sum(root.right);
  }
  private static int product(Node root){
    if (root == null) return 1;
    return root.val*product(root.left)*product(root.right);
  }

  private static int maximum(Node root){
    if (root == null) return Integer.MIN_VALUE;
    return Math.max(root.val,Math.max(maximum(root.left),maximum(root.right)));
  }

  private static int levels(Node root){
    if (root == null) return 0;
    return 1+ Math.max(levels(root.left),levels(root.right));
  }

  private static void levelOrderTraversal(Node root){
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
      Node front = q.remove();
      System.out.print(front.val+" ");
      if (front.left!=null) q.add(front.left);
      if (front.right!=null) q.add(front.right);
    }
    System.out.println();
  }

  private static void levelOrderTraversalLevelWise(Node root){
    Queue<Pair> q = new LinkedList<>();
    int currentLevel = 0;
    q.add(new Pair(root,0 ));
    while(!q.isEmpty()){
      Pair front = q.remove();
      if (front.level != currentLevel){
        currentLevel++;
        System.out.println();
      }
      System.out.print(front.node.val+" ");
      if (front.node.left!=null) q.add(new Pair(front.node.left, front.level+1));
      if (front.node.right!=null) q.add(new Pair(front.node.right, front.level+1));
    }
    System.out.println();
  }

  private static void display(Node root){
    if (root == null) return;
    System.out.print(root.val + " ");
    display(root.left);
    display(root.right);
  }
}
