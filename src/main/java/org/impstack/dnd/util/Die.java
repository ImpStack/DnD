package org.impstack.dnd.util;

import java.util.Random;

/**
 * @author remy
 * @since 30/11/17
 */
public class Die {

    public enum Type {
        D20("1d20", 20);

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
        return random.nextInt(die.getMax()) + 1;
    }

}
