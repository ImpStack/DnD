package org.impstack.dnd.domain;

import org.impstack.dnd.util.Die;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author remy
 * @since 30/11/17.
 */
public class Weapon {

    private String name;
    private Integer copperCoins;
    private Die.Type damage;
    private DamageType damageType;
    private float weight;
    private WeaponType type;
    private Set<WeaponProperty> properties;

    public Weapon() {
    }

    public Weapon(String name, Integer copperCoins, Die.Type damage, DamageType damageType, float weight, WeaponType type, WeaponProperty... properties) {
        this(name, copperCoins, damage, damageType, weight, type, new HashSet<>(Arrays.asList(properties)));
    }

    public Weapon(String name, Integer copperCoins, Die.Type damage, DamageType damageType, float weight, WeaponType type, Set<WeaponProperty> properties) {
        this.name = name;
        this.copperCoins = copperCoins;
        this.damage = damage;
        this.damageType = damageType;
        this.weight = weight;
        this.type = type;
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public Weapon setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getCopperCoins() {
        return copperCoins;
    }

    public Weapon setCopperCoins(Integer copperCoins) {
        this.copperCoins = copperCoins;
        return this;
    }

    public Die.Type getDamage() {
        return damage;
    }

    public Weapon setDamage(Die.Type damage) {
        this.damage = damage;
        return this;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public Weapon setDamageType(DamageType damageType) {
        this.damageType = damageType;
        return this;
    }

    public float getWeight() {
        return weight;
    }

    public Weapon setWeight(float weight) {
        this.weight = weight;
        return this;
    }

    public WeaponType getType() {
        return type;
    }

    public Weapon setType(WeaponType type) {
        this.type = type;
        return this;
    }

    public boolean isRanged() {
        return WeaponType.MARTIAL_RANGED == getType() || WeaponType.SIMPLE_RANGED == getType();
    }

    public boolean isMelee() {
        return !isRanged();
    }

    public Set<WeaponProperty> getProperties() {
        return properties;
    }

    public Weapon setProperties(Set<WeaponProperty> properties) {
        this.properties = properties;
        return this;
    }

    public Weapon setProperties(WeaponProperty... properties) {
        this.properties = new HashSet<>(Arrays.asList(properties));
        return this;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", copperCoins=" + copperCoins +
                ", damage=" + damage +
                ", damageType=" + damageType +
                ", weight=" + weight +
                ", type=" + type +
                ", properties=" + properties +
                '}';
    }

}
