package com.api.sistematransporteuniversitario.repositories;

import com.api.sistematransporteuniversitario.models.MarcasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MarcasRepository extends JpaRepository<MarcasModel, UUID> {
}
