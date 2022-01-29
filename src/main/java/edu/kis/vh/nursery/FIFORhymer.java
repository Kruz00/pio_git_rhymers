package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stacks.IntLinkedList;
import edu.kis.vh.nursery.stacks.IntStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final IntStack temp = new IntLinkedList();

	public FIFORhymer(IntStack list) {
		super(list);
	}

	public FIFORhymer() {
		super();
	}

	@Override
	public int countOut() {
		while (!callCheck())
			temp.push(super.countOut());
		
		int ret = temp.pop();
		
		while (!temp.isEmpty())
			countIn(temp.pop());
		
		return ret;
	}
}
