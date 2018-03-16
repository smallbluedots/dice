package com.smallbluedots.dice.generator;

import java.util.Random;

/**
 * Created by Dariusz Lelek on 3/16/2018.
 * dariusz.lelek@gmail.com
 */

public class RandomGenerator {
    private static final Random random = new Random();

    public static int getRandomIntPositive(int min, int max){
        min = min < 0 ? 0 : min;
        return getRandomInt(min, max);
    }

    public static int getRandomInt(int min, int max){
        return rangeIsValid(min, max) ? random.nextInt(max - min + 1) + min : 0;
    }

    private static boolean rangeIsValid(int min, int max){
        return max >= min;
    }
}
