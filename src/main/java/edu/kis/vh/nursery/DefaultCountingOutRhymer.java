package edu.kis.vh.nursery;

import edu.kis.vh.nursery.arrayStack.IntArrayStack;

public class DefaultCountingOutRhymer {

	private IntArrayStack stack;

	public DefaultCountingOutRhymer(IntArrayStack stack) {
		this.stack = stack;
	}

	public DefaultCountingOutRhymer() {
		 this.stack = new IntArrayStack();
	}

	public void countIn(int in) {
		stack.countIn(in);
	}

	public boolean callCheck() {
		return stack.callCheck();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int countOut() {
		return stack.countOut();
	}

	protected int peekaboo() {
		return stack.peekaboo();
	}
}
