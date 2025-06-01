package org.metro.entity.tarjeta;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tipo_tarjeta")
public class TipoTarjeta {
    private String id_tipo_tarjeta;
    private String descripcion;
    private double precio_pasaje;

    @ManyToOne
    //Indica el foregin key
    @JoinColumn(name = "id_tipo_tarjeta")
    private Tarjeta tarjeta;
}
