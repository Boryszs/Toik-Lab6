package com.company;

public class Compartment {
    private int min;
    private int max;

    public Compartment() {
        this.min=Quiz.MIN_VALUE;
        this.max=Quiz.MAX_VALUE;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
