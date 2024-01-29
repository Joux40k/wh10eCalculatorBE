package de.joux.kList.persistence.entity;

import lombok.Data;
import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;

@Entity
@Table(name = "model_keyword", schema = "wh10e")
@Data
public class ModelKeyword {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String name;
}
