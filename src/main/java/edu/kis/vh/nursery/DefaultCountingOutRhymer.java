package edu.kis.vh.nursery;


import edu.kis.vh.nursery.stacks.IntLinkedList;
import edu.kis.vh.nursery.stacks.IntStack;

public class DefaultCountingOutRhymer {

	private IntStack list;

	public DefaultCountingOutRhymer(IntStack list) {
		this.list = list;
	}

	public DefaultCountingOutRhymer() {
		 this.list = new IntLinkedList();
	}

	public void countIn(int in) {
		list.push(in);
	}

	public boolean callCheck() {
		return list.isEmpty();
	}

	public boolean isFull() {
		return list.isFull(); // zawsze false bo dynamicznie, chyba ze pamiec sie skonczy, można uwzglednic
	}

	public int countOut() {
		return list.pop();
	}

	protected int peekaboo() {
		return list.top();
	}
}
