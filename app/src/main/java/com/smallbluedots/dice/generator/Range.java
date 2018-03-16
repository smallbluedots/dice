package com.smallbluedots.dice.generator;

/**
 * Created by Dariusz Lelek on 3/16/2018.
 * dariusz.lelek@gmail.com
 */

public class Range {
    private final int min, max;

    public Range(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public boolean isValid(){
        return min < max;
    }
}
