package com.api.sistematransporteuniversitario.repositories;

import com.api.sistematransporteuniversitario.models.TransPaxModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TransPaxRepository extends JpaRepository<TransPaxModel, UUID> {
}
