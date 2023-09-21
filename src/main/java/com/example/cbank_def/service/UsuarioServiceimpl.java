package com.example.cbank_def.service;

import com.example.cbank_def.dto.UsuarioDTO;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UsuarioServiceimpl implements UsuarioService{
    @Override
    public List<UsuarioDTO> obtenerusuario() {
        return Arrays.asList(
                UsuarioDTO.builder()
                        .id(1)
                        .nombre("Juan")
                        .apellido("Diaz")
                        .cedula("100000")
                        .telefono("305000000")
                        .correo("Jdiaz@gmail.com")
                        .cuentaId(1004)
                        .build(),
                UsuarioDTO.builder()
                        .id(2)
                        .nombre("Mike")
                        .apellido("Rodri")
                        .cedula("200000")
                        .telefono("304000000")
                        .correo("Mike@gmail.com")
                        .cuentaId(1003)
                        .build()
        );
    }

    @Override
    public UsuarioDTO registraUsuario(UsuarioDTO usuarioDTO) throws Exception {
        return null;
    }
}
