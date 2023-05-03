package com.api.sistematransporteuniversitario.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "MARCAS")
public class MarcasModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @OneToMany(mappedBy = "fkMarca")
    private List<ModelosModel> modelosModelList;

    @Column(name = "M_NOME", nullable = false, length = 45)
    private String marcaNome;
}
