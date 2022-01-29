package edu.kis.vh.nursery.stacks;

public class IntArrayStack implements IntStack {

    final static int CAPACITY = 12;
    final static int EMPTY = -1;

    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY;

    public int getTotal() {
        return total;
    }

    @Override
    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }
    @Override
    public boolean isEmpty() {
        return total == EMPTY;
    }


    @Override
    public boolean isFull() {
        return total == CAPACITY-1;
    }

    @Override
    public int top() {
        if (isEmpty())
            return IntStack.DEFAULT;
        return numbers[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return IntStack.DEFAULT;
        return numbers[total--];
    }

}
