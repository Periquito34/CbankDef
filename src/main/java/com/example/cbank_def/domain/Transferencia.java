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
@Table(name= "transferencia")

public class Transferencia {

    @Id
    @Column(nullable = false, name = "id_transferencia")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String tipo_transferencia;

    @ManyToOne
    @JoinColumn(name = "id_cuenta_origen")
    private Cuenta cuentaOrigen;

    @ManyToOne
    @JoinColumn(name = "id_cuenta_destino")
    private Cuenta cuentaDestino;

}
