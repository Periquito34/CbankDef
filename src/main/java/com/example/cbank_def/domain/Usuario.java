package com.example.cbank_def.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "usuario")

public class Usuario {

    @Id
    @Column(nullable = false, name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 30, name="nombre_usuario")
    private String nombre;

    @Column(nullable = false, length = 30, name="apellido_Usuario")
    private String apellido;

    @Column(nullable = false, length = 30, name="cedula_usuario")
    private String cedula;

    @Column(nullable = false,length = 10,name="num_telefono")
    private String telefono;

    @Column(nullable = false, name="correo_usuario")
    private String correo;

    @OneToOne
    @JoinColumn(name = "id_cuenta")
    private Cuenta cuenta;


}
