package com.api.sistematransporteuniversitario.services;

import com.api.sistematransporteuniversitario.repositories.ModelosRepository;
import org.springframework.stereotype.Service;

@Service
public class ModelosService {

    final ModelosRepository modelosRepository;

    public ModelosService(ModelosRepository modelosRepository) {
        this.modelosRepository = modelosRepository;
    }
}
