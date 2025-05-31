package org.metro.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ruta {
    private char id_ruta;
    private String est_inicial;
    private String est_final;
}
