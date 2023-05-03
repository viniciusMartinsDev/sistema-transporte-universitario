package com.api.sistematransporteuniversitario.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "MODELOS")
public class Modelos implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "FK_MARCA")
    private Marcas fkMarca;

    public UUID getId() {
        return id;
    }

    public Marcas getFkMarca() {
        return fkMarca;
    }

    public void setFkMarca(Marcas fkMarca) {
        this.fkMarca = fkMarca;
    }
}
