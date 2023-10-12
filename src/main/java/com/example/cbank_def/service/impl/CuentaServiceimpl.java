package com.example.cbank_def.service.impl;


import com.example.cbank_def.domain.Cuenta;
import com.example.cbank_def.dto.CuentaDTO;
import com.example.cbank_def.mapper.CuentaMapper;
import org.springframework.stereotype.Service;

@Service
public class CuentaServiceimpl implements  com.example.cbank_def.service.CuentaService{

    private final com.example.cbank_def.repository.CuentaRepository cuentaRepository;

    public CuentaServiceimpl(com.example.cbank_def.repository.CuentaRepository cuentaRepository) {
        this.cuentaRepository = cuentaRepository;
    }

    @Override
    public CuentaDTO guardarCuenta(CuentaDTO cuentaDTO) throws Exception{

        //Validar datos cuenta

        if(cuentaDTO == null ){
            throw new Exception("Cuenta no puede ser nulo");
        }

        if(cuentaDTO.getSaldo() < 0){
            throw new Exception("Saldo no puede ser menor a 0");
        }

        if(cuentaDTO.getPin()== null || cuentaDTO.getPin().trim().equals("")){
            throw new Exception("Nombre Bolsillo no puede ser nulo o vacio");
        }

        //Registar cuenta DB mapenado desde dto a domain

        Cuenta cuenta = CuentaMapper.dtoToDomain(cuentaDTO);
        cuenta = cuentaRepository.save(cuenta);

        //Retornar cuenta

        cuentaDTO = CuentaMapper.domainToDto(cuenta);

        return cuentaDTO;

    }


}
