package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stacks.IntStack;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public HanoiRhymer(IntStack list) {
		super(list);
	}

	public HanoiRhymer() {
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}

// wiersze: 5, 12, 14, 15
// a+strzałka - przechodzenie po aktualnie aktualnie otwartych plikach