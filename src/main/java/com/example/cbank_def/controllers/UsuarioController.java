package com.example.cbank_def.controllers;
import com.example.cbank_def.domain.Usuario;
import com.example.cbank_def.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
         this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("/obtenerUsuario")
    public List<Usuario> obtenerUsuario() {
        return usuarioRepository.findAll();
    }


}
