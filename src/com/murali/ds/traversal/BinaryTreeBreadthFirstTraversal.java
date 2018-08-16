package com.murali.ds.traversal;

import com.murali.ds.queue.Queue;

/**
 * @author muralinutalapati
 */
public class BinaryTreeBreadthFirstTraversal {

  public static void main(String[] args) throws
        Queue.QueueUnderflowException, Queue.QueueOverflowException {
    // breadth first search
    breadthFirst(Tree.get());
  }

  public static void print(Node node) {
    System.out.print(node.getData() + "->");
  }

  public static void breadthFirst(Node root) throws
        Queue.QueueUnderflowException, Queue.QueueOverflowException {
    if (root == null) {
      return;
    }

    Queue<Node> queue = new Queue<>(Node.class);
    queue.enqueue(root);
    while (!queue.isEmpty()) {
      Node node = queue.dequeue();
      print(node);

      if (node.getLeftChild() != null) {
        queue.enqueue(node.getLeftChild());
      }
      if (node.getRightChild() != null) {
        queue.enqueue(node.getRightChild());
      }
    }
  }
}
