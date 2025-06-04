package org.antvance.domain.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_viaje;
    private Date fecha;
    private LocalTime hora_salida;
    private LocalTime hora_llegada;
    private String observacion;

    //Relación muchos a uno con Chofer
    @ManyToOne
    //Indica el foreign key
    @JoinColumn(name = "nro_licencia")
    private Chofer chofer;
}
