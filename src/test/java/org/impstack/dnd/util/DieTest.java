package org.impstack.dnd.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author remy
 * @since 30/11/17
 */
public class DieTest {

    private Die die = new Die();

    @Test
    public void roll() {
        int roll1D20 = die.roll(Die.Type.D20);
        Assert.assertTrue(roll1D20 >= 1 && roll1D20 <= 20);
    }
}
