package de.joux.kList.persistence.entity;

import lombok.Data;

import jakarta.persistence.*;

@Entity
@Data
public class Wargear {
    @Id
    @SequenceGenerator(name = "wargear_sequence", sequenceName = "wargear_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wargear_sequence")
    private long id;
    private String name;
    private String effect;
}
