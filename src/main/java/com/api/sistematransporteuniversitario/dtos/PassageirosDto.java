package com.api.sistematransporteuniversitario.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PassageirosDto {

    @NotBlank
    private String paxNome;

    @NotBlank
    private String paxSobrenome;

    @NotBlank
    @Size(max = 11)
    private String paxCPF;

    @NotBlank
    @Size(max = 9)
    private String paxRG;

    @NotBlank
    private String paxLoginEmail;

    @NotBlank
    private String paxLoginSenha;

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
}
