package edu.kis.vh.nursery.stacks;

public class Node {

	private final int value;
	private Node prev;
	private Node next;

	/**
	 *
	 * @param i value of node
	 */
	public Node(int i) {
		this.value = i;
	}

	/**
	 *
	 * @return value of node
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @return previous node
	 */
	public Node getPrev() {
		return prev;
	}

	/**
	 * @param prev previous node to set
	 */
	public void setPrev(Node prev) {
		this.prev = prev;
	}

	/**
	 * @return next node
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param next next node to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}
}
