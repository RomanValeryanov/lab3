package com.etu.titkov.uniteacher.entities;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Base entity which is a parent of other entities.
 *
 * @author Eugene Ray
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
