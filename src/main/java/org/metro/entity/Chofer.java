package org.metro.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Chofer {
    private String nro_licencia;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String placa;
}
