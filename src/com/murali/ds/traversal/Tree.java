package com.murali.ds.traversal;

/**
 * @author muralinutalapati
 */
public class Tree {

	// create a tree with mock nodes
	public static Node get() {
		final Node<Character> a = new Node<>('A');
		final Node<Character> b = new Node<>('B');
		final Node<Character> c = new Node<>('C');
		final Node<Character> d = new Node<>('D');
		final Node<Character> e = new Node<>('E');
		final Node<Character> f = new Node<>('F');
		final Node<Character> g = new Node<>('G');
		final Node<Character> h = new Node<>('H');
		final Node<Character> x = new Node<>('X');

		a.setLeftChild(b);
		a.setRightChild(c);
		b.setLeftChild(x);
		c.setLeftChild(d);
		c.setRightChild(e);
		d.setLeftChild(f);
		d.setRightChild(h);
		e.setRightChild(g);

		return a;
	}
}
