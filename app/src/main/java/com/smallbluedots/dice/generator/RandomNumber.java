package com.smallbluedots.dice.generator;

import java.util.Random;

/**
 * Created by Dariusz Lelek on 3/16/2018.
 * dariusz.lelek@gmail.com
 */

public class RandomNumber implements NumberProvider {
    private static final Random random = new Random();
    private final Range range;

    public RandomNumber(Range range) {
        this.range = range;
    }

    private int getRandomInt(){
        return range.isValid() ? random.nextInt(range.getMax() - range.getMin() + 1) + range.getMin() : 0;
    }

    @Override
    public int getNext() {
        return getRandomInt();
    }
}
