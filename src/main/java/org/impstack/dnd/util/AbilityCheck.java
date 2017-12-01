package org.impstack.dnd.util;

import org.impstack.dnd.domain.Abilities;

/**
 * @author remy
 * @since 1/12/17.
 */
public class AbilityCheck {

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
        return get(abilities.getStrength());
    }

    public int getDexterity(Abilities abilities) {
        return get(abilities.getDexterity());
    }

    public int getConstitution(Abilities abilities) {
        return get(abilities.getConstitution());
    }

    public int getIntelligence(Abilities abilities) {
        return get(abilities.getIntelligence());
    }

    public int getWisdom(Abilities abilities) {
        return get(abilities.getWisdom());
    }

    public int getCharisma(Abilities abilities) {
        return get(abilities.getCharisma());
    }

    public int get(int ability) {
        return die.roll(Die.Type.D20) + AbilityModifier.getModifier(ability);
    }
}
