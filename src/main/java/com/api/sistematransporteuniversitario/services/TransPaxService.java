package com.api.sistematransporteuniversitario.services;

import com.api.sistematransporteuniversitario.repositories.TransPaxRepository;
import org.springframework.stereotype.Service;

@Service
public class TransPaxService {

    final TransPaxRepository transPaxRepository;

    public TransPaxService(TransPaxRepository transPaxRepository) {
        this.transPaxRepository = transPaxRepository;
    }
}
