package de.joux.kList.persistence.entity;

import lombok.Data;

import jakarta.persistence.*;

@Entity
@Data
public class WeaponKeyword {
    @Id
    @SequenceGenerator(name = "weapon_keyword_sequence", sequenceName = "weapon_keyword_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "weapon_keyword_sequence")
    private long id;
    private String name;
    private String info;
}
