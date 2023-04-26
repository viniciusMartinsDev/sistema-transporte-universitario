package com.api.sistematransporteuniversitario.services;

import com.api.sistematransporteuniversitario.models.PassageirosModel;
import com.api.sistematransporteuniversitario.repositories.PassageirosRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassageirosService {

    final PassageirosRepository passageirosRepository;

    public PassageirosService(PassageirosRepository passageirosRepository) {
        this.passageirosRepository = passageirosRepository;
    }

    @Transactional
    public PassageirosModel salvar(PassageirosModel passageirosModel) {
        return passageirosRepository.save(passageirosModel);
    }

    public List<PassageirosModel> buscar() {
        return passageirosRepository.findAll();
    }
    
    public boolean existsByPaxCPF(String paxCPF) {
        return passageirosRepository.existsByPaxCPF(paxCPF);
    }

    public boolean existsByPaxRG(String paxRG) {
        return passageirosRepository.existsByPaxRG(paxRG);
    }

    public boolean existsByPaxLoginEmail(String paxLoginEmail) {
        return passageirosRepository.existsByPaxLoginEmail(paxLoginEmail);
    }
}
