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
        this.currentHitPoints = currentHitPoints;
        this.maxHitPoints = maxHitPoints;
    }

    public Integer getCurrentHitPoints() {
        return currentHitPoints;
    }

    public HitPoints setCurrentHitPoints(Integer currentHitPoints) {
        this.currentHitPoints = currentHitPoints;
        return this;
    }

    public Integer getMaxHitPoints() {
        return maxHitPoints;
    }

    public HitPoints setMaxHitPoints(Integer maxHitPoints) {
        this.maxHitPoints = maxHitPoints;
        return this;
    }

    @Override
    public String toString() {
        return "HitPoints{" +
                "currentHitPoints=" + currentHitPoints +
                ", maxHitPoints=" + maxHitPoints +
                '}';
    }
}
