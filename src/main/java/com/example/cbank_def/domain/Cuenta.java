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
@Table(name= "cuenta")

public class Cuenta {

    @Id
    @Column(nullable = false, name = "id_cuenta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 30, name="saldo")
    private String saldo;

    @Column(nullable = false, length = 30, name="pin")
    private String pin;



}
