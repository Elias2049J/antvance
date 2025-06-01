package org.metro.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehiculo {
    private String placa;
    private String modelo;
    private String marca;
    private Integer a_fabrica;
}
