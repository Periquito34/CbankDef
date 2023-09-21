package com.example.cbank_def.mapper;

import com.example.cbank_def.domain.Usuario;
import com.example.cbank_def.dto.UsuarioDTO;

import java.util.List;

public class UsuarioMapper {
    public static Usuario dtoToDomain(UsuarioDTO usuarioDTO){
        return Usuario.builder()
                .id(usuarioDTO.getId())
                .nombre(usuarioDTO.getNombre())
                .apellido(usuarioDTO.getApellido())
                .cedula(usuarioDTO.getCedula())
                .telefono(usuarioDTO.getTelefono())
                .correo(usuarioDTO.getCorreo())
                .build();
    }

    public static UsuarioDTO domainToDto(Usuario usuario){
        return UsuarioDTO.builder()
                .id(usuario.getId())
                .nombre(usuario.getNombre())
                .apellido(usuario.getApellido())
                .cedula(usuario.getCedula())
                .telefono(usuario.getTelefono())
                .correo(usuario.getCorreo())
                .build();
    }


    public static List<Usuario> dtoToDomainList(List<UsuarioDTO> UsuarioDTOS){
        return UsuarioDTOS.stream().map(UsuarioMapper::dtoToDomain).toList();
    }

    public static List<UsuarioDTO> domainToDtoList(List<Usuario> Usuarios){
        return Usuarios.stream().map(UsuarioMapper::domainToDto).toList();
    }
}
