package org.impstack.dnd.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author remy
 * @since 6/12/17.
 */
public class ProficiencyBonusTest {

    @Test
    public void proficiencyTest() {
        Assert.assertEquals(2, ProficiencyBonus.getModifier(1));
        Assert.assertEquals(4, ProficiencyBonus.getModifier(10));
        Assert.assertEquals(6, ProficiencyBonus.getModifier(20));
    }

}
