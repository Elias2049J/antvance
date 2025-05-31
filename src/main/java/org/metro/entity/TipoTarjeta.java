package org.metro.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoTarjeta {
    private String id_tipo_tarjeta;
    private String descripcion;
    private double precio_pasaje;
}
