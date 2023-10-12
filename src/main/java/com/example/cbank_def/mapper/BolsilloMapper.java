package com.example.cbank_def.mapper;

import com.example.cbank_def.domain.Bolsillo;
import com.example.cbank_def.dto.BolsilloDTO;

import java.util.List;

public class BolsilloMapper {

    public static Bolsillo dtoToDomain(BolsilloDTO bolsilloDTO){
        return Bolsillo.builder()
                .id(bolsilloDTO.getId())
                .dinero(bolsilloDTO.getDinero())
                .nombreBolsillo(bolsilloDTO.getNombreBolsillo())
                .build();
    }
    public static BolsilloDTO domainToDto(Bolsillo bolsillo){
        return BolsilloDTO.builder()
                .id(bolsillo.getId())
                .dinero(bolsillo.getDinero())
                .nombreBolsillo(bolsillo.getNombreBolsillo())
                .build();
    }

    public static List<Bolsillo> dtoToDomainList(List<BolsilloDTO> BolsilloDTOS){
        return BolsilloDTOS.stream().map(BolsilloMapper::dtoToDomain).toList();
    }

    public static List<BolsilloDTO> domainToDtoList(List<Bolsillo> Bolsillos){
        return Bolsillos.stream().map(BolsilloMapper::domainToDto).toList();
    }

}