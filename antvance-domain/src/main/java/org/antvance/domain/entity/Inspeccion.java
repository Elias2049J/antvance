package org.antvance.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Inspeccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_inspeccion;
    private String tipo;
    private Date fecha;
    private Integer kilometraje;
    private String resultado;
    private String observacion;

    @ManyToOne
    @JoinColumn(name = "placa")
    private Vehiculo vehiculo;
}
