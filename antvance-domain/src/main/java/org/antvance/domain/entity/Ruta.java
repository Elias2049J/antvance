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
@Table(name = "ruta")
public class Ruta {
    @Id
    protected String id_ruta;
    private String est_inicial;
    private String est_final;

    //Uno a muchos con estacion
    @OneToMany(mappedBy = "ruta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Estacion> estaciones;

    //Uno a muchos con vehículo
    @OneToMany(mappedBy = "ruta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Vehiculo> vehiculos;
}
