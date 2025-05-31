package org.metro.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaccion {
    private Integer id_transaccion;
    private Timestamp fecha_hora;
}
