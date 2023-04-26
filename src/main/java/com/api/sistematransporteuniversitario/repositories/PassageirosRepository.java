package com.api.sistematransporteuniversitario.repositories;

import com.api.sistematransporteuniversitario.models.PassageirosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PassageirosRepository extends JpaRepository<PassageirosModel, UUID> {

    boolean existsByPaxCPF(String paxCPF);
    boolean existsByPaxRG(String paxRG);
    boolean existsByPaxLoginEmail(String paxLoginEmail);
}
