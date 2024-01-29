package de.joux.kList.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "weapon_keyword", schema = "wh10e")
@Data
public class WeaponKeyword {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String name;
    @Column
    private String info;
}
