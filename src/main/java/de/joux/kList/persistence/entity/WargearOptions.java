package de.joux.kList.persistence.entity;

import lombok.Data;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Data
public class WargearOptions {
    @Id
    @SequenceGenerator(name = "wargear_options_sequence", sequenceName = "wargear_options_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wargear_options_sequence")
    private long id;
    private String name;
    @ManyToOne
    private WHModel WHModel;
    @ManyToMany
    private List<Weapon> weapons;
    @ManyToMany
    private List<Wargear> wargear;
}
