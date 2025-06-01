package org.metro.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ruta {
    protected String id_ruta;
    private String est_inicial;
    private String est_final;
}
