package org.impstack.dnd.domain;

/**
 * @author remy
 * @since 30/11/17.
 */
public class ManaPoints {

    private Integer currentManaPoints;
    private Integer maxManaPoints;

    public ManaPoints() {
    }

    public ManaPoints(Integer currentManaPoints, Integer maxManaPoints) {
        this.currentManaPoints = currentManaPoints;
        this.maxManaPoints = maxManaPoints;
    }

    public Integer getCurrentManaPoints() {
        return currentManaPoints;
    }

    public ManaPoints setCurrentManaPoints(Integer currentManaPoints) {
        this.currentManaPoints = currentManaPoints;
        return this;
    }

    public Integer getMaxManaPoints() {
        return maxManaPoints;
    }

    public ManaPoints setMaxManaPoints(Integer maxManaPoints) {
        this.maxManaPoints = maxManaPoints;
        return this;
    }

    @Override
    public String toString() {
        return "ManaPoints{" +
                "currentManaPoints=" + currentManaPoints +
                ", maxManaPoints=" + maxManaPoints +
                '}';
    }
}
