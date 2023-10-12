package com.example.cbank_def.service.impl;


import com.example.cbank_def.domain.Bolsillo;
import com.example.cbank_def.dto.BolsilloDTO;
import com.example.cbank_def.mapper.BolsilloMapper;
import org.springframework.stereotype.Service;

@Service
public class BolsilloServiceimpl implements com.example.cbank_def.service.BolsilloService {

    private final com.example.cbank_def.repository.BolsilloRepository bolsilloRepository;

    public BolsilloServiceimpl(com.example.cbank_def.repository.BolsilloRepository bolsilloRepository) {
        this.bolsilloRepository = bolsilloRepository;
    }
    @Override
    public BolsilloDTO guardarBolsillo(BolsilloDTO bolsilloDTO) throws Exception {
        //Validar datos Bolsillo

        if(bolsilloDTO == null ){
            throw new Exception("Bolsillo no puede ser nulo");
        }

        if(bolsilloDTO.getNombreBolsillo()== null || bolsilloDTO.getNombreBolsillo().trim().equals("")){
            throw new Exception("Nombre Bolsillo no puede ser nulo o vacio");
        }

        if(bolsilloDTO.getCuentaId() == null || bolsilloDTO.getCuentaId() < 0){
            throw new Exception("Cuenta no puede ser nulo o menor a 0");
        }

        if(bolsilloDTO.getDinero() < 0){
            throw new Exception("Dinero no puede ser menor a 0");
        }

        //Registrar Bolsillo DB mapenado desde dto a domain

        Bolsillo bolsillo = BolsilloMapper.dtoToDomain(bolsilloDTO);

        bolsillo = bolsilloRepository.save(bolsillo);

        //Retornar Bolsillo

        bolsilloDTO  = BolsilloMapper.domainToDto(bolsillo);

        return bolsilloDTO;
    }
}
