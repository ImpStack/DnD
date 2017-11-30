package org.impstack.dnd.domain;

/**
 * @author remy
 * @since 29/11/17.
 */
public class Race {

    private String name;
    private Long speed;
    private Size size;

    public Race() {
    }

    public Race(String name, Long speed, Size size) {
        this.name = name;
        this.speed = speed;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public Race setName(String name) {
        this.name = name;
        return this;
    }

    public Long getSpeed() {
        return speed;
    }

    public Race setSpeed(Long speed) {
        this.speed = speed;
        return this;
    }

    public Size getSize() {
        return size;
    }

    public Race setSize(Size size) {
        this.size = size;
        return this;
    }

    public String toString() {
        return "Race{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", size=" + size +
                '}';
    }
}