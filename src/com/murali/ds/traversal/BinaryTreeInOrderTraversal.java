package com.murali.ds.traversal;

/**
 * @author muralinutalapati
 */
public class BinaryTreeInOrderTraversal {

    public static void main(String[] args) {
        // dfs inorder traversal
        inOrder(Tree.get());
    }

    public static void print(Node node) {
        System.out.print(node.getData() + "->");
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.getLeftChild());
        print(root);
        inOrder(root.getRightChild());
    }


}
