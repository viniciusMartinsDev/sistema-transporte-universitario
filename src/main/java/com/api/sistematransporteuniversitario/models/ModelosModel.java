package com.api.sistematransporteuniversitario.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "MODELOS")
public class ModelosModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "FK_MARCA")
    private MarcasModel fkMarca;

    @Column(name = "MOD_NOME", nullable = false, length = 45)
    private String modNome;

    @Column(name = "MOD_ANO", nullable = false, length = 45)
    private String modAno;

    @OneToMany(mappedBy = "fkModelo")
    private List<TransportesModel> transportesModelList;

    public UUID getId() {
        return id;
    }

    public MarcasModel getFkMarca() {
        return fkMarca;
    }

    public void setFkMarca(MarcasModel fkMarca) {
        this.fkMarca = fkMarca;
    }

    public String getModNome() {
        return modNome;
    }

    public void setModNome(String modNome) {
        this.modNome = modNome;
    }

    public String getModAno() {
        return modAno;
    }

    public void setModAno(String modAno) {
        this.modAno = modAno;
    }

    public List<TransportesModel> getTransportesModelList() {
        return transportesModelList;
    }

    public void setTransportesModelList(List<TransportesModel> transportesModelList) {
        this.transportesModelList = transportesModelList;
    }
}
