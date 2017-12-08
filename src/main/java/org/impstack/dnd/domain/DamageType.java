package org.impstack.dnd.domain;

/**
 * @author remy
 * @since 1/12/17
 */
public enum DamageType {
    PIERCING("piercing"), BLUDGEONING("bludgeoning"), SLASHING("slashing"), NONE(null);

    String damage;
    DamageType(String s) {
        this.damage = s;
    }

    public String getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return damage;
    }
}
