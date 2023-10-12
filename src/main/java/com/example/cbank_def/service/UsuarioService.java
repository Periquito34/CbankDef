package com.example.cbank_def.service;

import com.example.cbank_def.dto.UsuarioDTO;
import  java.util.List;
public interface UsuarioService {

    List<UsuarioDTO> obtenerusuario();

    UsuarioDTO guardarUsuario(UsuarioDTO usuarioDTO) throws Exception;
}
