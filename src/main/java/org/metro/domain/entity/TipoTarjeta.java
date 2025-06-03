package org.metro.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tipo_tarjeta")
public class TipoTarjeta {
    @Id
    private String id_tipo_tarjeta;
    private String descripcion;
    private double precio_pasaje;

    @ManyToOne
    //Indica el foregin key
    @JoinColumn(name = "id_tarjeta")
    private Tarjeta tarjeta;
}
