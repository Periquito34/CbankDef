package com.example.cbank_def.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

    private Integer id;

    private String nombre;

    private String apellido;

    private String cedula;

    private String telefono;

    private String correo;

    private Integer cuentaId;
}
