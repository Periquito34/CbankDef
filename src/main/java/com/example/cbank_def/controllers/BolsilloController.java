package com.example.cbank_def.controllers;

import com.example.cbank_def.domain.Bolsillo;
import com.example.cbank_def.domain.Cuenta;
import com.example.cbank_def.dto.BolsilloDTO;
import com.example.cbank_def.dto.CuentaDTO;
import com.example.cbank_def.mapper.BolsilloMapper;
import com.example.cbank_def.mapper.CuentaMapper;
import com.example.cbank_def.repository.BolsilloRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class BolsilloController {

    private final BolsilloRepository bolsilloRepository;

    public BolsilloController(BolsilloRepository bolsilloRepository){
        this.bolsilloRepository = bolsilloRepository;
    }

    @GetMapping("obtenerBolsillo")
    public List<Bolsillo> obtenerBolsillo(){
        return bolsilloRepository.findAll();
    }

    @GetMapping("/porId/{id}")
    public ResponseEntity<Bolsillo> buscarPorId(@PathVariable Integer id) throws Exception{
        Bolsillo bolsillo = bolsilloRepository.getReferenceById(id);

        BolsilloDTO bolsilloDTO = BolsilloMapper.domainToDto(bolsillo);

        return new ResponseEntity<>(bolsillo, HttpStatus.OK);
    }

}
