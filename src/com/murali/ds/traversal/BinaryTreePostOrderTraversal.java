package com.murali.ds.traversal;

/**
 * @author muralinutalapati
 */
public class BinaryTreePostOrderTraversal {

    public static void main(String[] args) {
        // dfs postorder traversal
        postOrder(Tree.get());
    }

    public static void print(Node node) {
        System.out.print(node.getData() + "->");
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.getLeftChild());
        postOrder(root.getRightChild());
        print(root);
    }

}
