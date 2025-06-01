package org.metro.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inspeccion {
    private Integer id_inspeccion;
    private String tipo;
    private Date fecha;
    private Integer kilometraje;
    private String resultado;
    private String observacion;
}
