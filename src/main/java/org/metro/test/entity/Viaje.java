package org.metro.test.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Viaje {
    protected Integer id_viaje;
    private Date fecha;
    private LocalTime hora_salida;
    private LocalTime hora_llegada;
    private String observacion;
    private String nro_licencia;
}
