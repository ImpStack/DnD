package org.impstack.dnd.domain;

/**
 * @author remy
 * @since 29/11/17.
 */
public class Race {

    private String name;
    private long speed;
    private Size size;

    public Race() {
    }

    public Race(String name, long speed, Size size) {
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

    public long getSpeed() {
        return speed;
    }

    public Race setSpeed(long speed) {
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

    @Override
    public String toString() {
        return "Race{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", size=" + size +
                '}';
    }
}

/**
 * package org.impstack.dnd.persistence.entity;

 import javax.persistence.*;
 import java.util.Set;

 /**
 * @author remy
 * @since 27/06/17.
 */
//@Entity
//@Table( name = "RACE")
//public class RaceEntity {
//
//    private Long id;
//    private String name;
//    //    private String description;
//    private Set<TraitEntity> traits;
//    private Long speed;
//    private Set<LanguageEntity> languages;
//    private SizeEntity size;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column (name = "ID" )
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    @Column( name = "NAME")
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    @Column( name = "DESCRIPTION" )
//    public String getDescription() {
//        return description;
//    }

//    public void setDescription(String description) {
//        this.description = description;
//    }

//    @ManyToMany( fetch = FetchType.EAGER )
//    @JoinTable( name = "RACE_TRAIT",
//            joinColumns = @JoinColumn( name = "RACE_ID" ),
//            inverseJoinColumns = @JoinColumn( name = "TRAIT_ID" ),
//            uniqueConstraints = @UniqueConstraint( columnNames = { "RACE_ID", "TRAIT_ID" } ) )
//    public Set<TraitEntity> getTraits() {
//        return traits;
//    }
//
//    public void setTraits(Set<TraitEntity> traits) {
//        this.traits = traits;
//    }
//
//    @Column( name = "SPEED" )
//    public Long getSpeed() {
//        return speed;
//    }
//
//    public void setSpeed(Long speed) {
//        this.speed = speed;
//    }
//
//    @ManyToMany( fetch = FetchType.EAGER )
//    @JoinTable( name = "RACE_LANGUAGE",
//            joinColumns = @JoinColumn( name = "RACE_ID" ),
//            inverseJoinColumns = @JoinColumn( name = "LANGUAGE_ID" ),
//            uniqueConstraints = @UniqueConstraint( columnNames = { "RACE_ID", "LANGUAGE_ID" } ))
//    public Set<LanguageEntity> getLanguages() {
//        return languages;
//    }
//
//    public void setLanguages(Set<LanguageEntity> languages) {
//        this.languages = languages;
//    }
//
//    @OneToOne
//    @JoinColumn( name = "SIZE_ID" )
//    public SizeEntity getSize() {
//        return size;
//    }
//
//    public void setSize(SizeEntity size) {
//        this.size = size;
//    }
//}

// */
