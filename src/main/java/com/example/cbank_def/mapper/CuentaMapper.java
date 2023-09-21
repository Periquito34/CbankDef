package com.example.cbank_def.mapper;

import com.example.cbank_def.domain.Cuenta;
import com.example.cbank_def.dto.CuentaDTO;


import java.util.List;


public class CuentaMapper {

    public static Cuenta dtoToDomain(CuentaDTO CuentaDTO) {
        return Cuenta.builder()
                .id(CuentaDTO.getId())
                .saldo(CuentaDTO.getSaldo())
                .pin(CuentaDTO.getPin())
                .build();
    }

    public static CuentaDTO domainToDto(Cuenta Cuenta){
        return CuentaDTO.builder()
                .id(Cuenta.getId())
                .saldo(Cuenta.getSaldo())
                .pin(Cuenta.getPin())
                .build();
    }

    public static List<Cuenta> dtoToDomainList(List<CuentaDTO> CuentaDTOS){
        return CuentaDTOS.stream().map(CuentaMapper::dtoToDomain).toList();
    }

    public static List<CuentaDTO> domainToDtoList(List<Cuenta> Cuentas){
        return Cuentas.stream().map(CuentaMapper::domainToDto).toList();
    }

}
