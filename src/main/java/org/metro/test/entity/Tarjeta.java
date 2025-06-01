package org.metro.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tarjeta {
    private Integer id_tarjeta;
    private double saldo;
}
