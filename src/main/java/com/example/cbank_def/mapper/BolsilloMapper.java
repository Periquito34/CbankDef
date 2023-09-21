package com.example.cbank_def.mapper;

import com.example.cbank_def.domain.Bolsillo;
import com.example.cbank_def.dto.BolsilloDTO;

import java.util.List;

public class BolsilloMapper {

    public static Bolsillo dtoToDomain(BolsilloDTO BolsilloDTO) {
        return Bolsillo.builder()
                .id(BolsilloDTO.getId())
                .dinero(BolsilloDTO.getDinero())
                .nombreBolsillo(BolsilloDTO.getNombreBolsillo())

                .build();
    }
    public static BolsilloDTO domainToDto(Bolsillo Bolsillo){
        return BolsilloDTO.builder()
                .id(Bolsillo.getId())
                .dinero(Bolsillo.getDinero())
                .nombreBolsillo(Bolsillo.getNombreBolsillo())
                .cuentaId(Bolsillo.getCuenta())
                .build();
    }

    public static List<Bolsillo> dtoToDomainList(List<BolsilloDTO> BolsilloDTOS){
        return BolsilloDTOS.stream().map(BolsilloMapper::dtoToDomain).toList();
    }

    public static List<BolsilloDTO> domainToDtoList(List<Bolsillo> Bolsillos){
        return Bolsillos.stream().map(BolsilloMapper::domainToDto).toList();
    }

}
