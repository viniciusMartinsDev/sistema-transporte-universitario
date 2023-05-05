package com.api.sistematransporteuniversitario.services;

import com.api.sistematransporteuniversitario.repositories.TransPaxRepository;
import org.springframework.stereotype.Service;

@Service
public class TransportesService {

    final TransPaxRepository transPaxRepository;

    public TransportesService(TransPaxRepository transPaxRepository) {
        this.transPaxRepository = transPaxRepository;
    }
}
