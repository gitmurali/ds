package com.murali.ds.traversal;

/**
 * @author muralinutalapati
 */
public class BinaryTreePreOrderTraversal {

    public static void main(String[] args) {
        //dfs preorder traversal.
        preOrder(Tree.get());
    }

    public static void print(Node<Character>node) {
        System.out.print(node.getData() + "->");
    }

    public static void preOrder(Node<Character>root) {
        if (root == null) {
            return;
        }

        print(root);
        preOrder(root.getLeftChild());
        preOrder(root.getRightChild());
    }
}
