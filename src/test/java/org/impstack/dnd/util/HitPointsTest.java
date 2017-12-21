package org.impstack.dnd.util;

import org.impstack.dnd.domain.HitPoints;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author remy
 * @since 6/12/17.
 */
public class HitPointsTest {

    @Test
    public void testHitpoints() {
        HitPoints hitPoints = new HitPoints(10);
        Assert.assertEquals(new Integer(10), hitPoints.getMaxHitPoints());
        Assert.assertEquals(new Integer(10), hitPoints.getCurrentHitPoints());
        Assert.assertEquals(1, hitPoints.getPercentage(), 0);
        hitPoints.setCurrentHitPoints(5);
        Assert.assertEquals(new Integer(10), hitPoints.getMaxHitPoints());
        Assert.assertEquals(new Integer(5), hitPoints.getCurrentHitPoints());
        Assert.assertEquals(0.5, hitPoints.getPercentage(), 0);
        Assert.assertFalse(hitPoints.isDeath());
        hitPoints.setCurrentHitPoints(-5);
        Assert.assertEquals(new Integer(10), hitPoints.getMaxHitPoints());
        Assert.assertEquals(new Integer(0), hitPoints.getCurrentHitPoints());
        Assert.assertEquals(0, hitPoints.getPercentage(), 0);
        Assert.assertTrue(hitPoints.isDeath());
        hitPoints = new HitPoints(20);
        Assert.assertEquals(new Integer(12), hitPoints.removeHitPoints(8).getCurrentHitPoints());
        Assert.assertEquals(new Integer(20), hitPoints.addHitPoints(10).getCurrentHitPoints());
    }

}
