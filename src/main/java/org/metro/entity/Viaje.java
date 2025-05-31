package org.metro.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Viaje {
    private Integer id_viaje;
    private Date fecha;
    private Time hora_salida;
    private Time hora_llegada;
    private String observacion;
}
