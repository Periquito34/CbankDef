package com.example.cbank_def.mapper;

import com.example.cbank_def.domain.Transferencia;
import com.example.cbank_def.domain.TransferenciaDTO;

import java.util.List;

public class TransferenciaMapper {

    public static Transferencia dtoToDomain(TransferenciaDTO TransferenciaDTO){
        return Transferencia.builder()
                .id(TransferenciaDTO.getId())
                .tipo_transferencia(TransferenciaDTO.getTipo_transferencia())
                .cuentaOrigen(TransferenciaDTO.getCuentaOrigen())
                .cuentaDestino(TransferenciaDTO.getCuentaDestino())
                .build();
    }

    public static TransferenciaDTO domainToDto(Transferencia Transferencia){
        return TransferenciaDTO.builder()
                .id(Transferencia.getId())
                .tipo_transferencia(Transferencia.getTipo_transferencia())
                .cuentaOrigen(Transferencia.getCuentaOrigen())
                .cuentaDestino(Transferencia.getCuentaDestino())
                .build();
    }

    public static List<Transferencia> dtoToDomainList(List<TransferenciaDTO> TransferenciaDTOS){
        return TransferenciaDTOS.stream().map(TransferenciaMapper::dtoToDomain).toList();
    }

    public static List<TransferenciaDTO> domainToDtoList(List<Transferencia> Transferencias){
        return Transferencias.stream().map(TransferenciaMapper::domainToDto).toList();
    }
}
