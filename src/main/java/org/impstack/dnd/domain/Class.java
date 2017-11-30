package org.impstack.dnd.domain;

import java.util.Set;

/**
 * @author remy
 * @since 30/11/17.
 */
public class Class {

    private String name;
    private Long hitDie;
    private Set<ArmorType> armorTypeProficiencies;
    private Set<Weapon> weaponProficiencies;

    public Class() {
    }

    public Class(String name, Long hitDie, Set<ArmorType> armorTypeProficiencies, Set<Weapon> weaponProficiencies) {
        this.name = name;
        this.hitDie = hitDie;
        this.armorTypeProficiencies = armorTypeProficiencies;
        this.weaponProficiencies = weaponProficiencies;
    }

    public String getName() {
        return name;
    }

    public Class setName(String name) {
        this.name = name;
        return this;
    }

    public Long getHitDie() {
        return hitDie;
    }

    public Class setHitDie(Long hitDie) {
        this.hitDie = hitDie;
        return this;
    }

    public Set<ArmorType> getArmorTypeProficiencies() {
        return armorTypeProficiencies;
    }

    public Class setArmorTypeProficiencies(Set<ArmorType> armorTypeProficiencies) {
        this.armorTypeProficiencies = armorTypeProficiencies;
        return this;
    }

    public Set<Weapon> getWeaponProficiencies() {
        return weaponProficiencies;
    }

    public Class setWeaponProficiencies(Set<Weapon> weaponProficiencies) {
        this.weaponProficiencies = weaponProficiencies;
        return this;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", hitDie=" + hitDie +
                ", armorTypeProficiencies=" + armorTypeProficiencies +
                ", weaponProficiencies=" + weaponProficiencies +
                '}';
    }

}
