package edu.kis.vh.nursery.stacks;

public class IntLinkedList implements IntStack {

	private Node last;
	int i;
	final static int DEFAULT = -1;

	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int top() {
		if (isEmpty())
			return DEFAULT;
		return last.getValue();
	}

	@Override
	public int pop() {
		if (isEmpty())
			return DEFAULT;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
