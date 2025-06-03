package org.metro.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chofer")
public class Chofer {
    @Id
    private String nro_licencia;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String placa;

    //Uno a uno con vehículo
    @OneToOne(mappedBy = "chofer", cascade = CascadeType.ALL, orphanRemoval = true)
    private Vehiculo vehiculo;

    //Relación uno a muchos con Viaje
    @OneToMany(mappedBy = "chofer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Viaje> viajes;

}
