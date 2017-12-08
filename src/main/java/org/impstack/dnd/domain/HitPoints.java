package org.impstack.dnd.domain;

/**
 * @author remy
 * @since 30/11/17.
 */
public class HitPoints {

    private Integer currentHitPoints;
    private Integer maxHitPoints;

    public HitPoints() {
    }

    public HitPoints(Integer maxHitPoints) {
        this(maxHitPoints, maxHitPoints);
    }

    public HitPoints(Integer currentHitPoints, Integer maxHitPoints) {
        setCurrentHitPoints(currentHitPoints);
        setMaxHitPoints(maxHitPoints);
    }

    public Integer getCurrentHitPoints() {
        return currentHitPoints;
    }

    public HitPoints setCurrentHitPoints(Integer currentHitPoints) {
        this.currentHitPoints = currentHitPoints < 0 ? 0 : currentHitPoints;
        return this;
    }

    public Integer getMaxHitPoints() {
        return maxHitPoints;
    }

    public HitPoints setMaxHitPoints(Integer maxHitPoints) {
        this.maxHitPoints = maxHitPoints;
        return this;
    }

    /**
     * Returns the current hitpoints percentage.
     * @return a value between [0-1] representing the hit points percentage
     */
    public float getPercentage() {
        return (float) getCurrentHitPoints() / (float) getMaxHitPoints();
    }

    /**
     * @return true if the current hitpoints are lower then or equal to 0, false otherwise
     */
    public boolean isDeath() {
        return 0 >= currentHitPoints;
    }

    @Override
    public String toString() {
        return "HitPoints{" +
                "currentHitPoints=" + currentHitPoints +
                ", maxHitPoints=" + maxHitPoints +
                '}';
    }
}
