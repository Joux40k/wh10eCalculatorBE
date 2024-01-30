package de.joux.kList.persistence.entity;

import lombok.Data;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Data
public class Weapon {
    @Id
    @SequenceGenerator(name = "weapon_sequence", sequenceName = "weapon_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "weapon_sequence")
    private long id;
    private String reach;
    private String skill;
    private String attacks;
    private String strength;
    private String amorPenetration;
    private String damage;
    @ManyToMany
    private List<WeaponKeyword> weaponKeywords;
}
