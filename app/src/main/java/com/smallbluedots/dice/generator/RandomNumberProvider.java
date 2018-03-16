package com.smallbluedots.dice.generator;

import android.support.annotation.NonNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dariusz Lelek on 3/16/2018.
 * dariusz.lelek@gmail.com
 */

public class RandomNumberProvider {
    private static final Map<Range, NumberProvider> cache = new HashMap<>();

    public static NumberProvider getRandomNumber(@NonNull final Range range){
        if(!cache.containsKey(range)){
            cache.put(range, new RandomNumber(range));
        }

        return cache.get(range);
    }
}
