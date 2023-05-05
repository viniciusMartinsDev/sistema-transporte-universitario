package com.api.sistematransporteuniversitario.services;

import com.api.sistematransporteuniversitario.repositories.ListaControleRepository;
import org.springframework.stereotype.Service;

@Service
public class ListaControleService {

    final ListaControleRepository listaControleRepository;


    public ListaControleService(ListaControleRepository listaControleRepository) {
        this.listaControleRepository = listaControleRepository;
    }
}
