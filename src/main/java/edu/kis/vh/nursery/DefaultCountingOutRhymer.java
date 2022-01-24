package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	final static int CAPACITY = 12;
	final static int EMPTY = -1;
	final static int DEFAULT = -1;

	private final int[] numbers = new int[CAPACITY];

	private int total = EMPTY;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}
	public boolean callCheck() {
		return total == EMPTY;
	}


	public boolean isFull() {
		return total == CAPACITY-1;
	}

	protected int peekaboo() {
		if (callCheck())
			return DEFAULT;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return DEFAULT;
		return numbers[total--];
	}

}
