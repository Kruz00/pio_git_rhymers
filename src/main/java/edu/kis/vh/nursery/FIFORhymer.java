package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stacks.IntStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

	public FIFORhymer(IntStack list) {
		super(list);
	}

	public FIFORhymer() {
	}

	@Override
	public int countOut() {
		while (!callCheck())
			super.countIn(super.countOut());
		
		int ret = super.countOut();
		
		while (!super.callCheck())
			countIn(super.countOut());
		
		return ret;
	}
}
