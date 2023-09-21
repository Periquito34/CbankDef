package com.example.cbank_def.mapper;

import com.example.cbank_def.domain.Transferencia;
import com.example.cbank_def.dto.TransferenciaDTO;

import java.util.List;

public class TransferenciaMapper {

    public static Transferencia dtoToDomain(TransferenciaDTO transferenciaDTO){
        return Transferencia.builder()
                .id(transferenciaDTO.getId())
                .tipo_transferencia(transferenciaDTO.getTipo_transferencia())
                .build();
    }

    public static TransferenciaDTO domainToDto(Transferencia transferencia){
        return TransferenciaDTO.builder()
                .id(transferencia.getId())
                .tipo_transferencia(transferencia.getTipo_transferencia())
                .build();
    }

    public static List<Transferencia> dtoToDomainList(List<TransferenciaDTO> TransferenciaDTOS){
        return TransferenciaDTOS.stream().map(TransferenciaMapper::dtoToDomain).toList();
    }

    public static List<TransferenciaDTO> domainToDtoList(List<Transferencia> Transferencias){
        return Transferencias.stream().map(TransferenciaMapper::domainToDto).toList();
    }
}

