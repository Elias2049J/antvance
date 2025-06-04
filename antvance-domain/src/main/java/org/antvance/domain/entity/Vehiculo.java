package org.antvance.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vehiculo")
public class Vehiculo {
    @Id
    private String placa;
    private String modelo;
    private String marca;
    private Integer a_fabrica;

    //Uno a uno con chofer
    @OneToOne
    //FK de Chofer
    @JoinColumn(name = "nro_licencia")
    private Chofer chofer;

    //Uno a muchos con inspecciones
    @OneToMany(mappedBy = "vehiculo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Inspeccion> inspecciones;

    //Muchos a uno con ruta
    @ManyToOne
    //FK de Ruta
    @JoinColumn(name = "id_ruta")
    private Ruta ruta;
}
