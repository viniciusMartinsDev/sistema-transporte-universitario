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
import java.util.Optional;
import java.util.UUID;

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

    @GetMapping("/{id}")
    public ResponseEntity<Object> getUmPassageiro(@PathVariable(value = "id") UUID id) {
        Optional<PassageirosModel> passageirosModelOptional = passageirosService.findById(id);

        if (!passageirosModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Passageiro não encontrado.");
        }

        return ResponseEntity.status(HttpStatus.OK).body(passageirosModelOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletePassageiro(@PathVariable(value = "id") UUID id) {
        Optional<PassageirosModel> passageirosModelOptional = passageirosService.findById(id);

        if (!passageirosModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Passageiro não existe");
        }

        passageirosService.delete(passageirosModelOptional.get());

        return ResponseEntity.status(HttpStatus.OK).body("Passageiro deletado com sucesso.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updatePassageiro(@PathVariable(value = "id") UUID id, @RequestBody @Valid PassageirosDto passageirosDto) {
        Optional<PassageirosModel> passageirosModelOptional = passageirosService.findById(id);

        if (!passageirosModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Passageiro não existe");
        }

        PassageirosModel passageirosModel = passageirosModelOptional.get();
        passageirosModel.setPaxNome(passageirosDto.getPaxNome());
        passageirosModel.setPaxSobrenome(passageirosDto.getPaxSobrenome());
        passageirosModel.setPaxCPF(passageirosDto.getPaxCPF());
        passageirosModel.setPaxRG(passageirosDto.getPaxRG());
        passageirosModel.setPaxLoginEmail(passageirosDto.getPaxLoginEmail());
        passageirosModel.setPaxLoginSenha(passageirosDto.getPaxLoginSenha());

        return ResponseEntity.status(HttpStatus.CREATED).body(passageirosService.salvar(passageirosModel));
    }

}
