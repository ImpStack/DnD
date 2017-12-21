package org.impstack.dnd.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * @author remy
 * @since 30/11/17
 */
public class Die {

    private static final Logger LOG = LoggerFactory.getLogger(Die.class);

    public enum Type {
        D20("1d20", 20),
        D6("1d6", 6),
        D8("1d8", 8),
        D100("1d100", 100);

        String name;
        int max;

        Type(String name, int max) {
            this.name = name;
            this.max = max;
        }

        public String getName() {
            return name;
        }

        public int getMax() {
            return this.max;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    private Random random;

    public Die() {
        random = new Random();
    }

    public Die(long seed) {
        random = new Random(seed);
    }

    public int roll(Type die) {
        return roll(die, 1);
    }

    public int roll(Type die, int times) {
        int total = 0;
        for (int i = 0; i < times; i++) {
            int roll = random.nextInt(die.getMax()) + 1;
            total += roll;
            LOG.debug("Roll {}: {}", die, roll);
        }
        return total;
    }

}
