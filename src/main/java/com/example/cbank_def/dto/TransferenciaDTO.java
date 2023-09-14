package com.example.cbank_def.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransferenciaDTO {

    private Integer id;

    private String tipo_transferencia;

    private Integer cuentaOrigenId;

    private Integer cuentaDestinoId;
}
