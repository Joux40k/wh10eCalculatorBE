package de.joux.kList.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "weapon", schema = "wh10e")
@Data
public class Weapon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String range;
    @Column
    private String skill;
    @Column
    private String attacks;
    @Column
    private String strength;
    @Column(name = "amor_penetration")
    private String amorPenetration;
    @Column
    private String damage;
    @ManyToMany
    @JoinTable(name = "weapon_keyword_relation",
            joinColumns=@JoinColumn(name = "weapon_id"),
            inverseJoinColumns = @JoinColumn(name = "weapon_keyword_id"))
    private List<WeaponKeyword> weaponKeywords;
}
