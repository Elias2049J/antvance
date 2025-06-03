package org.metro.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "estacion")
public class Estacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_estacion;
    private String nombre;
    private String ubicacion;

    @ManyToOne
    //FK de Ruta
    @JoinColumn(name = "id_ruta")
    private Ruta ruta;
}
