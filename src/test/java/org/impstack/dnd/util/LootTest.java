package org.impstack.dnd.util;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author remy
 * @since 21/12/17.
 */
public class LootTest {

    private static final Logger LOG = LoggerFactory.getLogger(LootTest.class);
    @Test
    public void coins() {
        Loot loot = new Loot();
        Coins coins = loot.getCoinsForIndividual(0.25f);
        Assert.assertNotNull(coins);
        Assert.assertTrue(coins.getCopper() > 0 || coins.getGold() > 0);
        LOG.info("Received {} from a monster with challenge rating {}", coins, 0.25f);
    }
}
