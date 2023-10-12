package com.example.cbank_def.service.impl;

import com.example.cbank_def.domain.Transferencia;
import com.example.cbank_def.dto.TransferenciaDTO;
import com.example.cbank_def.mapper.TransferenciaMapper;
import org.springframework.stereotype.Service;


@Service
public class TransferenciaServiceimpl implements com.example.cbank_def.service.TransferenciaService{

    private final com.example.cbank_def.repository.TransferenciaRepository transferenciaRepository;

    public TransferenciaServiceimpl(com.example.cbank_def.repository.TransferenciaRepository transferenciaRepository) {
        this.transferenciaRepository = transferenciaRepository;
    }

    @Override

    public TransferenciaDTO guardarTransferencia(TransferenciaDTO transferenciaDTO) throws Exception {

        //Validar datos transferencia

        if(transferenciaDTO == null ){
            throw new Exception("Transferencia no puede ser nulo");
        }

        if(transferenciaDTO.getTipo_transferencia()== null || transferenciaDTO.getTipo_transferencia().trim().equals("")){
            throw new Exception("Tipo de transferencia no puede ser nulo o vacio");
        }
        if(transferenciaDTO.getCuentaDestinoId() == null || transferenciaDTO.getCuentaDestinoId() < 0){
            throw new Exception("Cuenta Destino no puede ser nulo o menor a 0");
        }

        if(transferenciaDTO.getCuentaOrigenId() == null || transferenciaDTO.getCuentaOrigenId() < 0){
            throw new Exception("Cuenta Origen no puede ser nulo o menor a 0");
        }

        //Registrar transferencia DB mapenado desde dto a domain

        Transferencia transferencia = TransferenciaMapper.dtoToDomain(transferenciaDTO);

        transferencia = transferenciaRepository.save(transferencia);

        //Retornar transferencia

        transferenciaDTO  = TransferenciaMapper.domainToDto(transferencia);


        return transferenciaDTO;
    }
}
