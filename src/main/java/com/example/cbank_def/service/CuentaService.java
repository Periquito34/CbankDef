package com.example.cbank_def.service;

import com.example.cbank_def.dto.CuentaDTO;

public interface CuentaService {
    CuentaDTO guardarCuenta(CuentaDTO cuentaDTO) throws Exception;
}
