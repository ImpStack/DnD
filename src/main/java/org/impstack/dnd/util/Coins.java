package org.impstack.dnd.util;

/**
 * A helper class to handle coins.
 * 1 gold == 100 copper
 *
 * @author remy
 * @since 21/12/17.
 */
public class Coins {

    public static final String CURRENCY_GOLD = "g";
    public static final String CURRENCY_COPPER = "cp";

    private int copper = 0;
    private int gold = 0;

    public Coins(int gold, int copper) {
        add(gold, copper);
    }

    public Coins add(Coins coins) {
        return add(coins.getGold(), coins.getCopper());
    }

    public Coins add(int gold, int copper) {
        if (gold < 0 || copper < 0) {
            throw new IllegalArgumentException(String.format("Invalid currency specified: %d%s %d%s", gold, CURRENCY_GOLD, copper, CURRENCY_COPPER));
        }
        this.gold += gold;
        this.copper += copper;
        update();
        return this;
    }

    public Coins remove(int gold, int copper) {
        // we don't have enough money
        if (!isAffordable(gold, copper)) {
            throw new IllegalArgumentException(String.format("Can't remove %d%s %d%s. Only %d%s %d%s available", gold, CURRENCY_GOLD, copper, CURRENCY_COPPER, getGold(), CURRENCY_GOLD, getCopper(), CURRENCY_COPPER));
        }
        this.gold -= gold;
        this.copper -= copper;
        update();
        return this;
    }

    public int getGold() {
        return gold;
    }

    public int getCopper() {
        return copper;
    }

    public boolean isAffordable(int gold, int copper) {
        return totalInCopper(getGold(), getCopper()) >= totalInCopper(gold, copper);
    }

    static int totalInCopper(int gold, int copper) {
        return 100 * gold + copper;
    }

    /**
     * internal use only, this method recalculates the money.
     * eg. 1g and 250copper will become 3g and 50 copper
     */
    void update() {
        int totalCopper = getGold() * 100 + getCopper();
        gold = Math.floorDiv(totalCopper, 100);
        copper = totalCopper % 100;
    }

    @Override
    public String toString() {
        return "Coins{" +
                "gold=" + gold +
                ", copper=" + copper +
                '}';
    }
}
