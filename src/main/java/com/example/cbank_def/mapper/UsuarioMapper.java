package com.example.cbank_def.mapper;

import com.example.cbank_def.domain.Usuario;
import com.example.cbank_def.domain.UsuarioDTO;

import java.util.List;

public class UsuarioMapper {
    public static Usuario dtoToDomain(UsuarioDTO UsuarioDTO){
        return Usuario.builder()
                .id(UsuarioDTO.getId())
                .nombre(UsuarioDTO.getNombre())
                .apellido(UsuarioDTO.getApellido())
                .cedula(UsuarioDTO.getCedula())
                .telefono(UsuarioDTO.getTelefono())
                .correo(UsuarioDTO.getCorreo())
                .cuenta(UsuarioDTO.getCuenta())
                .build();
    }

    public static UsuarioDTO domainToDto(Usuario Usuario){
        return UsuarioDTO.builder()
                .id(Usuario.getId())
                .nombre(Usuario.getNombre())
                .apellido(Usuario.getApellido())
                .cedula(Usuario.getCedula())
                .telefono(Usuario.getTelefono())
                .correo(Usuario.getCorreo())
                .cuenta(Usuario.getCuenta())
                .build();
    }


    public static List<Usuario> dtoToDomainList(List<UsuarioDTO> UsuarioDTOS){
        return UsuarioDTOS.stream().map(UsuarioMapper::dtoToDomain).toList();
    }

    public static List<UsuarioDTO> domainToDtoList(List<Usuario> Usuarios){
        return Usuarios.stream().map(UsuarioMapper::domainToDto).toList();
    }
}
