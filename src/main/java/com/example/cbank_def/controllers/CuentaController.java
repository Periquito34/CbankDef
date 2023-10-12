package com.example.cbank_def.controllers;


import com.example.cbank_def.domain.Cuenta;
import com.example.cbank_def.domain.Usuario;
import com.example.cbank_def.dto.CuentaDTO;
import com.example.cbank_def.dto.UsuarioDTO;
import com.example.cbank_def.mapper.CuentaMapper;
import com.example.cbank_def.mapper.UsuarioMapper;
import com.example.cbank_def.repository.CuentaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/porId/{id}")
    public ResponseEntity<CuentaDTO> buscarPorId(@PathVariable Integer id) throws Exception{
        Cuenta cuenta = cuentaRepository.getReferenceById(id);

        CuentaDTO cuentaDTO = CuentaMapper.domainToDto(cuenta);

        return new ResponseEntity<>(cuentaDTO, HttpStatus.OK);
    }

}
