package org.impstack.dnd.domain;

/**
 * @author remy
 * @since 30/11/17.
 */
public class Abilities {

    private Integer strength;
    private Integer dexterity;
    private Integer constitution;
    private Integer intelligence;
    private Integer wisdom;
    private Integer charisma;

    public Abilities() {
    }

    public Abilities(Integer strength, Integer dexterity, Integer constitution, Integer intelligence, Integer wisdom, Integer charisma) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public Integer getStrength() {
        return strength;
    }

    public Abilities setStrength(Integer strength) {
        this.strength = strength;
        return this;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public Abilities setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
        return this;
    }

    public Integer getConstitution() {
        return constitution;
    }

    public Abilities setConstitution(Integer constitution) {
        this.constitution = constitution;
        return this;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public Abilities setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
        return this;
    }

    public Integer getWisdom() {
        return wisdom;
    }

    public Abilities setWisdom(Integer wisdom) {
        this.wisdom = wisdom;
        return this;
    }

    public Integer getCharisma() {
        return charisma;
    }

    public Abilities setCharisma(Integer charisma) {
        this.charisma = charisma;
        return this;
    }

    @Override
    public String toString() {
        return "Abilities{" +
                "strength=" + strength +
                ", dexterity=" + dexterity +
                ", constitution=" + constitution +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", charisma=" + charisma +
                '}';
    }
}
