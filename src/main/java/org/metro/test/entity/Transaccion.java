package org.metro.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaccion {
    protected Integer id_transaccion;
    private Timestamp fecha_hora;
    private Integer id_tarjeta;
    private Integer id_modulo;
}
