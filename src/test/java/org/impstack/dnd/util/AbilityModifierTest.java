package org.impstack.dnd.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author remy
 * @since 30/11/17
 */
public class AbilityModifierTest {

    @Test
    public void testModifier() {
        Assert.assertTrue(-5 == AbilityModifier.getModifier(1));
        Assert.assertTrue(-2 == AbilityModifier.getModifier(7));
        Assert.assertTrue(0 == AbilityModifier.getModifier(10));
        Assert.assertTrue(0 == AbilityModifier.getModifier(11));
        Assert.assertTrue(3 == AbilityModifier.getModifier(16));
        Assert.assertTrue(3 == AbilityModifier.getModifier(17));
        Assert.assertTrue(8 == AbilityModifier.getModifier(26));
        Assert.assertTrue(10 == AbilityModifier.getModifier(30));
    }

}
