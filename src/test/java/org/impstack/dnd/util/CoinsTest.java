package org.impstack.dnd.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author remy
 * @since 21/12/17.
 */
public class CoinsTest {

    @Test
    public void coins() {
        Coins coins = new Coins(0, 631);
        Assert.assertEquals(6, coins.getGold());
        Assert.assertEquals(31, coins.getCopper());
    }

    @Test
    public void add() {
        Coins coins = new Coins(0, 0);
        coins.add(1, 3);
        Assert.assertEquals(1, coins.getGold());
        Assert.assertEquals(3, coins.getCopper());
        coins.add(0, 1337);
        Assert.assertEquals(14, coins.getGold());
        Assert.assertEquals(40, coins.getCopper());
    }

    @Test
    public void remove() {
        Coins coins = new Coins(1, 50);
        coins.remove(1, 20);
        Assert.assertEquals(0, coins.getGold());
        Assert.assertEquals(30, coins.getCopper());
    }

    @Test(expected = IllegalArgumentException.class)
    public void exceptionWhenRemoving() {
        new Coins(0, 20).remove(1, 20);

    }

    @Test(expected = IllegalArgumentException.class)
    public void exceptionWhenAdding() {
        new Coins(0, 20).add(-2, 51);

    }
}
