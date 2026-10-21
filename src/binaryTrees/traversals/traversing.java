package binaryTrees.traversals;
class Node{
  int val;
  Node left;
  Node right;

  Node(int val){
    this.val = val;
  }
}
public class traversing {
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

    System.out.print("Preorder Traversal : ");
    preOrder(a);
    System.out.println();
    System.out.print("Inorder Traversal : ");
    inOrder(a);
    System.out.println();
    System.out.print("Postorder Traversal : ");
    postOrder(a);
  }

  private static void preOrder(Node root){
    if (root == null) return;

    System.out.print(root.val+" ");
    preOrder(root.left);
    preOrder(root.right);
  }

  private static void inOrder(Node root){
    if (root == null) return;

    inOrder(root.left);
    System.out.print(root.val+" ");
    inOrder(root.right);
  }

  private static void postOrder(Node root){
    if (root == null) return;

    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.val+" ");
  }
}
