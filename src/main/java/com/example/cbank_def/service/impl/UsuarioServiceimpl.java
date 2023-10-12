package com.example.cbank_def.service.impl;


import com.example.cbank_def.domain.Usuario;
import com.example.cbank_def.dto.UsuarioDTO;
import com.example.cbank_def.mapper.UsuarioMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceimpl implements com.example.cbank_def.service.UsuarioService {

    private final com.example.cbank_def.repository.UsuarioRepository usuarioRepository;

    public UsuarioServiceimpl(com.example.cbank_def.repository.UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<UsuarioDTO> obtenerusuario() {
        return null;
    }

    @Override

    public UsuarioDTO guardarUsuario(UsuarioDTO usuarioDTO) throws Exception{

        //Validar datos usuario

        if(usuarioDTO == null ){
            throw new Exception("Usuario no puede ser nulo");
        }

        if(usuarioDTO.getNombre()== null || usuarioDTO.getNombre().trim().equals("")){
            throw new Exception("Nombre no puede ser nulo o vacio");
        }

        if(usuarioDTO.getApellido()== null || usuarioDTO.getApellido().trim().equals("")){
            throw new Exception("Apellido no puede ser nulo o vacio");
        }

        if(usuarioDTO.getCedula()== null || usuarioDTO.getCedula().trim().equals("")){
            throw new Exception("Cedula no puede ser nulo o vacio");
        }

        if(usuarioDTO.getTelefono()== null || usuarioDTO.getTelefono().trim().equals("")){
            throw new Exception("Telefono no puede ser nulo o vacio");
        }

        if(usuarioDTO.getCorreo()== null || usuarioDTO.getCorreo().trim().equals("")){
            throw new Exception("Correo no puede ser nulo o vacio");
        }

        if(usuarioDTO.getCuentaId() == null || usuarioDTO.getCuentaId() < 0){
            throw new Exception("Cuenta no puede ser nulo o menor a 0");
        }

        //Registar usuario DB mapenado desde dto a domain

        Usuario usuario = UsuarioMapper.dtoToDomain(usuarioDTO);
        usuario = usuarioRepository.save(usuario);

        //Retornar usuario

        usuarioDTO = UsuarioMapper.domainToDto(usuario);

        return usuarioDTO;

    }
}
