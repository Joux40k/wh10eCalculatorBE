package de.joux.kList.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Data
public class WHModel {
    @Id
    @SequenceGenerator(name = "model_sequence", sequenceName = "model_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "model_sequence")
    private long id;
    private String name;
    private String move;
    private String toughness;
    private String save;
    private String invulnerableSave;
    private String wounds;
    private String leadership;
    private String objectiveControl;
}