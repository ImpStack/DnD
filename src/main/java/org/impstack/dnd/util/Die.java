package org.impstack.dnd.util;

import java.util.Random;

/**
 * @author remy
 * @since 30/11/17
 */
public class Die {

    public enum Type {
        D20(20);

        int max;

        Type(int max) {
            this.max = max;
        }

        public int getMax() {
            return this.max;
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
