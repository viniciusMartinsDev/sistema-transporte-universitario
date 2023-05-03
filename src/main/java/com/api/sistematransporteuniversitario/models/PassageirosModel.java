package com.api.sistematransporteuniversitario.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "PASSAGEIROS")
public class PassageirosModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "PAX_NOME", nullable = false, length = 45)
    private String paxNome;

    @Column(name = "PAX_SOBRENOME", nullable = false, length = 45)
    private String paxSobrenome;

    @Column(name = "PAX_CPF", nullable = false, unique = true, length = 11)
    private String paxCPF;

    @Column(name = "PAX_RG", nullable = false, unique = true, length = 9)
    private String paxRG;

    @Column(name = "PAX_LOGIN_EMAIL", nullable = false, unique = true, length = 45)
    private String paxLoginEmail;

    @Column(name = "PAX_LOGIN_SENHA", nullable = false, length = 45)
    private String paxLoginSenha;

    @OneToMany(mappedBy = "fkPaxRepre")
    private List<TransportesModel> transportesModelList;

    @OneToMany(mappedBy = "fkPax")
    private List<SolicitacaoRegistroModel> solicitacaoRegistroModels;


    public UUID getId() {
        return id;
    }

    public String getPaxNome() {
        return paxNome;
    }

    public void setPaxNome(String paxNome) {
        this.paxNome = paxNome;
    }

    public String getPaxSobrenome() {
        return paxSobrenome;
    }

    public void setPaxSobrenome(String paxSobrenome) {
        this.paxSobrenome = paxSobrenome;
    }

    public String getPaxCPF() {
        return paxCPF;
    }

    public void setPaxCPF(String paxCPF) {
        this.paxCPF = paxCPF;
    }

    public String getPaxRG() {
        return paxRG;
    }

    public void setPaxRG(String paxRG) {
        this.paxRG = paxRG;
    }

    public String getPaxLoginEmail() {
        return paxLoginEmail;
    }

    public void setPaxLoginEmail(String paxLoginEmail) {
        this.paxLoginEmail = paxLoginEmail;
    }

    public String getPaxLoginSenha() {
        return paxLoginSenha;
    }

    public void setPaxLoginSenha(String paxLoginSenha) {
        this.paxLoginSenha = paxLoginSenha;
    }

    public List<TransportesModel> getTransportesModelList() {
        return transportesModelList;
    }

    public void setTransportesModelList(List<TransportesModel> transportesModelList) {
        this.transportesModelList = transportesModelList;
    }

    public List<SolicitacaoRegistroModel> getSolicitacaoRegistroModels() {
        return solicitacaoRegistroModels;
    }

    public void setSolicitacaoRegistroModels(List<SolicitacaoRegistroModel> solicitacaoRegistroModels) {
        this.solicitacaoRegistroModels = solicitacaoRegistroModels;
    }
}
