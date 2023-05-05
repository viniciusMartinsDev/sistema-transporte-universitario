package com.api.sistematransporteuniversitario.services;

import com.api.sistematransporteuniversitario.repositories.ModelosRepository;
import org.springframework.stereotype.Service;

@Service
public class MarcasService {

    final ModelosRepository modelosRepository;

    public MarcasService(ModelosRepository modelosRepository) {
        this.modelosRepository = modelosRepository;
    }
}
