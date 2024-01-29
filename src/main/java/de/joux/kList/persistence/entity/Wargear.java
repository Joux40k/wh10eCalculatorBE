package de.joux.kList.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "wargear", schema = "wh10e")
@Data
public class Wargear {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String name;
    @Column
    private String effect;
}
