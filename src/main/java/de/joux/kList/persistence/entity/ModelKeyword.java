package de.joux.kList.persistence.entity;

import lombok.Data;

import jakarta.persistence.*;

@Entity
@Data
public class ModelKeyword {
    @Id
    @SequenceGenerator(name = "model_keyword_sequence", sequenceName = "model_keyword_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "model_keyword_sequence")
    private long id;
    private String name;
}
