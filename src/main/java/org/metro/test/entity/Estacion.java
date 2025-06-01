package org.metro.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estacion {
    private Integer id_estacion;
    private String nombre;
    private String ubicacion;
}
