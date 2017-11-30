package org.impstack.dnd.domain;

/**
 * @author private
 * @since 30/11/17.
 */
public class Experience {

    private Integer experience;
    private Integer maxExperience;

    public Experience() {
    }

    public Experience(Integer experience, Integer maxExperience) {
        this.experience = experience;
        this.maxExperience = maxExperience;
    }

    public Integer getExperience() {
        return experience;
    }

    public Experience setExperience(Integer experience) {
        this.experience = experience;
        return this;
    }

    public Integer getMaxExperience() {
        return maxExperience;
    }

    public Experience setMaxExperience(Integer maxExperience) {
        this.maxExperience = maxExperience;
        return this;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "experience=" + experience +
                ", maxExperience=" + maxExperience +
                '}';
    }
}
