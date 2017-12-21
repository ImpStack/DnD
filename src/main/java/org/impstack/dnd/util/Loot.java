package org.impstack.dnd.util;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * @author remy
 * @since 21/12/17.
 */
public class Loot {

    private Die die;

    public Loot() {
        this(new Die());
    }

    public Loot(Die die) {
        this.die = die;
    }

    public Coins getCoinsForIndividual(float challengeRating) {
        if (challengeRating < 4) {
            int roll = die.roll(Die.Type.D100);
            if (roll <= 30) {
                return new Coins(0, die.roll(Die.Type.D6, 5));
            } else if (roll <= 60) {
                return new Coins(0, 10 * die.roll(Die.Type.D6, 4));
            } else if (roll <= 70) {
                return new Coins(0, 50 * die.roll(Die.Type.D6, 3));
            } else if (roll <= 95) {
                return new Coins(die.roll(Die.Type.D6, 3), 0);
            } else {
                return new Coins(10 * die.roll(Die.Type.D6), 0);
            }
        }
        throw new NotImplementedException();
    }
}
