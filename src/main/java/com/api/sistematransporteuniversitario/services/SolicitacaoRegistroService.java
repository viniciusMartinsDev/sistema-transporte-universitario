package com.api.sistematransporteuniversitario.services;

import com.api.sistematransporteuniversitario.repositories.SolicitacaoRegistroRepository;
import org.springframework.stereotype.Service;

@Service
public class SolicitacaoRegistroService {

    final SolicitacaoRegistroRepository solicitacaoRegistroRepository;

    public SolicitacaoRegistroService(SolicitacaoRegistroRepository solicitacaoRegistroRepository) {
        this.solicitacaoRegistroRepository = solicitacaoRegistroRepository;
    }
}
