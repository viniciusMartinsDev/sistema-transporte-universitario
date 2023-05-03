package com.api.sistematransporteuniversitario.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TRANS_PAX")
public class TransPaxModel implements Serializable {

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

    @Column(name = "TRANS_PAX_ASSENTO")
    private String transPaxAssento;

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

    public String getTransPaxAssento() {
        return transPaxAssento;
    }

    public void setTransPaxAssento(String transPaxAssento) {
        this.transPaxAssento = transPaxAssento;
    }
}
