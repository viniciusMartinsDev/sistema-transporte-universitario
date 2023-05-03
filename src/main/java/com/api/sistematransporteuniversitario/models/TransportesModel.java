package com.api.sistematransporteuniversitario.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
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

    @OneToMany(mappedBy = "fkTrans")
    private List<SolicitacaoRegistroModel> solicitacaoRegistroModels;

    @OneToMany(mappedBy = "fkTrans")
    private List<ListaControleModel> listaControleModelList;

    @OneToMany(mappedBy = "fkTrans")
    private List<TransPaxModel> transPaxModelList;

    public UUID getId() {
        return id;
    }

    public ModelosModel getFkModelo() {
        return fkModelo;
    }

    public void setFkModelo(ModelosModel fkModelo) {
        this.fkModelo = fkModelo;
    }

    public PassageirosModel getFkPaxRepre() {
        return fkPaxRepre;
    }

    public void setFkPaxRepre(PassageirosModel fkPaxRepre) {
        this.fkPaxRepre = fkPaxRepre;
    }

    public String getTransPlaca() {
        return transPlaca;
    }

    public void setTransPlaca(String transPlaca) {
        this.transPlaca = transPlaca;
    }

    public String getTransRenavam() {
        return transRenavam;
    }

    public void setTransRenavam(String transRenavam) {
        this.transRenavam = transRenavam;
    }

    public List<SolicitacaoRegistroModel> getSolicitacaoRegistroModels() {
        return solicitacaoRegistroModels;
    }

    public void setSolicitacaoRegistroModels(List<SolicitacaoRegistroModel> solicitacaoRegistroModels) {
        this.solicitacaoRegistroModels = solicitacaoRegistroModels;
    }

    public List<ListaControleModel> getListaControleModelList() {
        return listaControleModelList;
    }

    public void setListaControleModelList(List<ListaControleModel> listaControleModelList) {
        this.listaControleModelList = listaControleModelList;
    }

    public List<TransPaxModel> getTransPaxModelList() {
        return transPaxModelList;
    }

    public void setTransPaxModelList(List<TransPaxModel> transPaxModelList) {
        this.transPaxModelList = transPaxModelList;
    }
}
