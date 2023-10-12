package com.example.cbank_def.controllers;

import com.example.cbank_def.domain.Bolsillo;
import com.example.cbank_def.repository.BolsilloRepository;
import org.springframework.web.bind.annotation.GetMapping;
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

}
