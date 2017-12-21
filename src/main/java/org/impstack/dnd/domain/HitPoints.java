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
        setMaxHitPoints(maxHitPoints);
        setCurrentHitPoints(currentHitPoints);
    }

    public Integer getCurrentHitPoints() {
        return currentHitPoints;
    }

    public HitPoints setCurrentHitPoints(Integer currentHitPoints) {
        this.currentHitPoints = Math.max(0, Math.min(maxHitPoints, currentHitPoints));
        return this;
    }

    public Integer getMaxHitPoints() {
        return maxHitPoints;
    }

    public HitPoints setMaxHitPoints(Integer maxHitPoints) {
        this.maxHitPoints = maxHitPoints;
        return this;
    }

    public HitPoints removeHitPoints(Integer removeHitPoints) {
        return setCurrentHitPoints(getCurrentHitPoints() - Math.abs(removeHitPoints));
    }

    public HitPoints addHitPoints(Integer addHitPoints) {
        return setCurrentHitPoints(getCurrentHitPoints() + Math.abs(addHitPoints));
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
