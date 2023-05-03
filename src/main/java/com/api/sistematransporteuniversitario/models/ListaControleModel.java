package com.api.sistematransporteuniversitario.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "LISTA_CONTROLE")
public class ListaControleModel implements Serializable {
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

    @Column(name = "LISTA_CONTROLE_IDA", nullable = false)
    private boolean listaControleIda;

    @Column(name = "LISTA_CONTROLE_PRESENTE")
    private boolean listaControlePresente;

    @Column(name = "LISTA_CONTROLE_DATA_DIA", nullable = false, length = 10)
    private String listaControleDataDia;

    @Column(name = "LISTA_CONTROLE_DATA_MES", nullable = false, length = 10)
    private String listaControleDataMes;

    @Column(name = "LISTA_CONTROLE_DATA_ANO", nullable = false, length = 10)
    private String listaControleDataAno;

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

    public boolean isListaControleIda() {
        return listaControleIda;
    }

    public void setListaControleIda(boolean listaControleIda) {
        this.listaControleIda = listaControleIda;
    }

    public boolean isListaControlePresente() {
        return listaControlePresente;
    }

    public void setListaControlePresente(boolean listaControlePresente) {
        this.listaControlePresente = listaControlePresente;
    }

    public String getListaControleDataDia() {
        return listaControleDataDia;
    }

    public void setListaControleDataDia(String listaControleDataDia) {
        this.listaControleDataDia = listaControleDataDia;
    }

    public String getListaControleDataMes() {
        return listaControleDataMes;
    }

    public void setListaControleDataMes(String listaControleDataMes) {
        this.listaControleDataMes = listaControleDataMes;
    }

    public String getListaControleDataAno() {
        return listaControleDataAno;
    }

    public void setListaControleDataAno(String listaControleDataAno) {
        this.listaControleDataAno = listaControleDataAno;
    }
}
