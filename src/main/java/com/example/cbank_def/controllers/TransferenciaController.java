package com.example.cbank_def.controllers;

import com.example.cbank_def.domain.Transferencia;
import com.example.cbank_def.repository.TransferenciaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transferencia")
public class TransferenciaController {

    private final TransferenciaRepository transferenciaRepository;

    public TransferenciaController(TransferenciaRepository transferenciaRepository){
        this.transferenciaRepository = transferenciaRepository;
    }

    @GetMapping("/obtenertodos")
    public List<Transferencia> obtenertodos() {
        return transferenciaRepository.findAll();
    }
    }

