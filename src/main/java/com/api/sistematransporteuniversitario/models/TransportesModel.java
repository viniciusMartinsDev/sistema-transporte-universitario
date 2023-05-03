package com.api.sistematransporteuniversitario.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TRANSPORTES")
public class TransportesModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "FK_MODELO")
    private ModelosModel fkModelo;

    @ManyToOne
    @JoinColumn(name = "FK_PAX_REPRE")
    private PassageirosModel fkPaxRepre;

    @Column(name = "TRANS_PLACA", nullable = false, length = 45)
    private String transPlaca;

    @Column(name = "TRANS_RENAVAM", nullable = false, length = 45)
    private String transRenavam;
}
