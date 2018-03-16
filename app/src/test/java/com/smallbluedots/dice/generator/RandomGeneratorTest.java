package com.smallbluedots.dice.generator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dariusz Lelek on 3/16/2018.
 * dariusz.lelek@gmail.com
 */
public class RandomGeneratorTest {
    private final static int maxCounter = 20;

    @Test
    public void getRandomIntValidParams() throws Exception {
        int min = 0;
        int max = 10;
        int randomInt = RandomGenerator.getRandomInt(min, max);

        Assert.assertTrue("Value generated " + randomInt + " lower than limit", randomInt >= min);
        Assert.assertTrue("Value generated " + randomInt + "  higher than limit", randomInt <= max);
    }

    @Test
    public void getRandomIntInvalidParams() throws Exception {
        int min = 2;
        int max = 1;
        int randomInt = RandomGenerator.getRandomInt(min, max);

        Assert.assertEquals("Value generated " + randomInt + " different form 0", 0, randomInt);
    }

    @Test
    public void getRandomIntValidParamsMin() throws Exception {
        int min = 0;
        int max = 1;
        int counter = 0;
        int randomInt;

        while((randomInt = RandomGenerator.getRandomInt(min, max)) != min && counter < maxCounter){
            counter ++;
        }

        Assert.assertEquals("Value generated " + randomInt + " different form " + min, min, randomInt);
    }

    @Test
    public void getRandomIntValidParamsMax() throws Exception {
        int min = 0;
        int max = 1;
        int counter = 0;
        int randomInt;

        while((randomInt = RandomGenerator.getRandomInt(min, max)) != max && counter < maxCounter){
            counter ++;
        }

        Assert.assertEquals("Value generated " + randomInt + " different form " + max, max, randomInt);
    }

    @Test
    public void getRandomIntValidParamsNegative() throws Exception {
        int min = -10;
        int max = 0;
        int randomInt = RandomGenerator.getRandomIntPositive(min, max);

        Assert.assertEquals("Value generated " + randomInt + " different form " + max, max, randomInt);
    }
}