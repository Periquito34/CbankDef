package com.example.cbank_def.controllers;

import com.example.cbank_def.domain.Transferencia;
import com.example.cbank_def.domain.Usuario;
import com.example.cbank_def.dto.TransferenciaDTO;
import com.example.cbank_def.dto.UsuarioDTO;
import com.example.cbank_def.mapper.TransferenciaMapper;
import com.example.cbank_def.mapper.UsuarioMapper;
import com.example.cbank_def.repository.TransferenciaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/porId/{id}")
    public ResponseEntity<Transferencia> buscarPorId(@PathVariable Integer id) throws Exception{
        Transferencia transferencia = transferenciaRepository.getReferenceById(id);

        TransferenciaDTO transferenciaDTO = TransferenciaMapper.domainToDto(transferencia);

        return new ResponseEntity<>(transferencia, HttpStatus.OK);
    }

    }

