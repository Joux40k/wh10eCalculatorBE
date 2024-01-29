package de.joux.kList.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "model", schema = "wh10e")
@Data
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String name;
    @Column
    private String move;
    @Column
    private String toughness;
    @Column
    private String save;
    @Column(name = "invulnerable_save")
    private String invulnerableSave;
    @Column
    private String wounds;
    @Column
    private String leadership;
    @Column(name = "objective_control")
    private String objectiveControl;
}