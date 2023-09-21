package com.example.cbank_def.controllers;

import com.example.cbank_def.dto.CuentaDTO;
import com.example.cbank_def.service.UsuarioService;
import com.example.cbank_def.dto.UsuarioDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    private UsuarioService usuarioService;

    @GetMapping("/obtenerUsuario")
    public ResponseEntity<List<UsuarioDTO>> obtenerUsuario() {

        return new ResponseEntity<>(usuarioService.obtenerusuario(), HttpStatus.OK);

    }

    public ResponseEntity registrarUsuario(@RequestBody UsuarioDTO usuarioDTO){
        try {
            return new ResponseEntity(usuarioService.registraUsuario(usuarioDTO),HttpStatus.OK);

        } catch (Exception e) {
            return  new ResponseEntity(CuentaDTO.builder().id(Integer.valueOf(e.getMessage())).build(), HttpStatus.BAD_REQUEST);
        }

    }


}
