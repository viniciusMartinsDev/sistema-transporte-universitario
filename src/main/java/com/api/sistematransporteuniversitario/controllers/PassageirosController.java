package com.api.sistematransporteuniversitario.controllers;

import com.api.sistematransporteuniversitario.dtos.PassageirosDto;
import com.api.sistematransporteuniversitario.models.PassageirosModel;
import com.api.sistematransporteuniversitario.services.PassageirosService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/passageiros")
public class PassageirosController {

    final PassageirosService passageirosService;

    public PassageirosController(PassageirosService passageirosService) {
        this.passageirosService = passageirosService;
    }

    @PostMapping
    public ResponseEntity<Object> salvarPassageiro(@RequestBody @Valid PassageirosDto passageirosDto) {


        if (passageirosService.existsByPaxCPF(passageirosDto.getPaxCPF())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflito: Já existe um passageiro com este CPF");
        }

        if (passageirosService.existsByPaxRG(passageirosDto.getPaxRG())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflito: Já existe um passageiro com este RG");
        }

        if (passageirosService.existsByPaxLoginEmail(passageirosDto.getPaxLoginEmail())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflito: Já existe um passageiro com este email");
        }

        PassageirosModel passageirosModel = new PassageirosModel();
        BeanUtils.copyProperties(passageirosDto, passageirosModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(passageirosService.salvar(passageirosModel));


    }

    @GetMapping
    public ResponseEntity<List<PassageirosModel>> getTodosPassageiros() {
        return ResponseEntity.status(HttpStatus.OK).body(passageirosService.buscar());
    }

}
