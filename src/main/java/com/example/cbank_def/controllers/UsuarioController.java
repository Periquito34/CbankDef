package com.example.cbank_def.controllers;
import com.example.cbank_def.domain.Transferencia;
import com.example.cbank_def.domain.Usuario;
import com.example.cbank_def.dto.UsuarioDTO;
import com.example.cbank_def.mapper.UsuarioMapper;
import com.example.cbank_def.repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/porId/{id}")
    public ResponseEntity<UsuarioDTO> buscarPorId(@PathVariable Integer id) throws Exception{
        Usuario usuario = usuarioRepository.getReferenceById(id);

        UsuarioDTO usuarioDTO = UsuarioMapper.domainToDto(usuario);

        return new ResponseEntity<>(usuarioDTO, HttpStatus.OK);
    }

}
