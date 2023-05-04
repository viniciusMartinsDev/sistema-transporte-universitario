package com.api.sistematransporteuniversitario.repositories;

import com.api.sistematransporteuniversitario.models.ListaControleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ListaControleRepository extends JpaRepository<ListaControleModel, UUID> {
}
