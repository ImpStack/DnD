package org.impstack.dnd.util;

import org.impstack.dnd.domain.Abilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author remy
 * @since 1/12/17.
 */
public class AbilityCheck {

    private static final Logger LOG = LoggerFactory.getLogger(AbilityCheck.class);

    private Die die;

    public AbilityCheck() {
        this(new Die());
    }

    public AbilityCheck(Die die) {
        this.die = die;
    }

    public int getInitiative(Abilities abilities) {
        return getDexterity(abilities);
    }

    public int getStrength(Abilities abilities) {
        return get(abilities.getStrength(), "STR");
    }

    public int getDexterity(Abilities abilities) {
        return get(abilities.getDexterity(), "DEX");
    }

    public int getConstitution(Abilities abilities) {
        return get(abilities.getConstitution(), "CON");
    }

    public int getIntelligence(Abilities abilities) {
        return get(abilities.getIntelligence(), "INT");
    }

    public int getWisdom(Abilities abilities) {
        return get(abilities.getWisdom(), "WIS");
    }

    public int getCharisma(Abilities abilities) {
        return get(abilities.getCharisma(), "CHA");
    }

    public int get(int value, String ability) {
        int roll = die.roll(Die.Type.D20);
        int modifier = AbilityModifier.getModifier(value);
        int total = roll + modifier;
        LOG.trace("[Ability ({}) check: {} + {}]({}) + {} = {}", ability, Die.Type.D20, modifier, roll, modifier, total);
        return total;
    }
}
