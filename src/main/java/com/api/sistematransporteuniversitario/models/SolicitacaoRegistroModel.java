package com.api.sistematransporteuniversitario.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "SOLICITACAO_REGISTRO")
public class SolicitacaoRegistroModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "FK_PAX")
    private PassageirosModel fkPax;

    @ManyToOne
    @JoinColumn(name = "FK_TRANS")
    private TransportesModel fkTrans;

    @Column(name = "SOLICITACAO_REGISTRO_STATUS", nullable = false)
    private boolean solicitacaoRegistroStatus;

    public UUID getId() {
        return id;
    }

    public PassageirosModel getFkPax() {
        return fkPax;
    }

    public void setFkPax(PassageirosModel fkPax) {
        this.fkPax = fkPax;
    }

    public TransportesModel getFkTrans() {
        return fkTrans;
    }

    public void setFkTrans(TransportesModel fkTrans) {
        this.fkTrans = fkTrans;
    }

    public boolean isSolicitacaoRegistroStatus() {
        return solicitacaoRegistroStatus;
    }

    public void setSolicitacaoRegistroStatus(boolean solicitacaoRegistroStatus) {
        this.solicitacaoRegistroStatus = solicitacaoRegistroStatus;
    }
}
