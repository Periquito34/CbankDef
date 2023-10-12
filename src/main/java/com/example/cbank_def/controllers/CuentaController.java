package com.example.cbank_def.controllers;


import com.example.cbank_def.domain.Cuenta;
import com.example.cbank_def.repository.CuentaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cuenta")
public class CuentaController {

    private final CuentaRepository cuentaRepository;

    public CuentaController (CuentaRepository cuentaRepository) {
        this.cuentaRepository = cuentaRepository;
    }

    @GetMapping("/obtenerCuenta")
    public List<Cuenta> obtenerCuenta(){
        return cuentaRepository.findAll();
    }
}
