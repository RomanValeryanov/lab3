package com.etu.grigorova.otdel_kadrov.entities;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public class OriginEntity implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
