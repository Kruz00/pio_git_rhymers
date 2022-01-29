package edu.kis.vh.nursery.stacks;

public interface IntStack {
    int DEFAULT = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
