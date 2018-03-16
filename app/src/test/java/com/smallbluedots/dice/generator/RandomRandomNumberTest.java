package com.smallbluedots.dice.generator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dariusz Lelek on 3/16/2018.
 * dariusz.lelek@gmail.com
 */
public class RandomRandomNumberTest {
    private final static int maxCounter = 20;

    @Test
    public void getRandomIntValidParams() throws Exception {
        Range range = new Range(0, 10);
        int randomInt = RandomNumberProvider.getRandomNumber(range).getNext();

        Assert.assertTrue("Value generated " + randomInt + " lower than limit", randomInt >= range.getMin());
        Assert.assertTrue("Value generated " + randomInt + "  higher than limit", randomInt <= range.getMax());
    }

    @Test
    public void getRandomIntInvalidParams() throws Exception {
        Range range = new Range(2, 1);
        int randomInt = RandomNumberProvider.getRandomNumber(range).getNext();

        Assert.assertEquals("Value generated " + randomInt + " different form 0", 0, randomInt);
    }

    @Test
    public void getRandomIntValidParamsMin() throws Exception {
        Range range = new Range(0, 1);
        int counter = 0;
        int randomInt;

        while((randomInt = RandomNumberProvider.getRandomNumber(range).getNext()) != range.getMin() && counter < maxCounter){
            counter ++;
        }

        Assert.assertEquals("Value generated " + randomInt + " different form " + range.getMin(), range.getMin(), randomInt);
    }

    @Test
    public void getRandomIntValidParamsMax() throws Exception {
        Range range = new Range(0, 1);
        int counter = 0;
        int randomInt;

        while((randomInt = RandomNumberProvider.getRandomNumber(range).getNext()) != range.getMax() && counter < maxCounter){
            counter ++;
        }

        Assert.assertEquals("Value generated " + randomInt + " different form " + range.getMax(), range.getMax(), randomInt);
    }

    @Test
    public void getRandomIntValidParamsNegative() throws Exception {
        Range range = new Range(-10, 0);
        int randomInt = RandomNumberProvider.getRandomNumber(range).getNext();

        Assert.assertEquals("Value generated " + randomInt + " different form " + range.getMax(), range.getMax(), randomInt);
    }
}