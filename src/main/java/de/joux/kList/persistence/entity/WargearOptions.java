package de.joux.kList.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "wargear_options", schema = "wh10e")
@Data
public class WargearOptions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String name;
    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;
    @ManyToMany
    @JoinTable(name = "wargear_options_weapons_relation",
            joinColumns = @JoinColumn(name = "wargear_option_id"),
            inverseJoinColumns = @JoinColumn(name = "weapon_id"))
    private List<Weapon> weapons;
    @ManyToMany
    @JoinTable(name = "wargear_options_wargear_relation",
            joinColumns = @JoinColumn(name = "wargear_options_id"),
            inverseJoinColumns = @JoinColumn(name = "wargear_id"))
    private List<Wargear> wargear;
}
