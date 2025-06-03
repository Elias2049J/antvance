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
@Table(name = "modulo")
public class Modulo {
    @Id
    protected Integer id_modulo;
    private String tipo_modulo;

    //Muchos a uno con estacion
    @ManyToOne
    @JoinColumn(name = "id_estacion")
    private Estacion estacion;

    //Uno a Muchos con transaccion
    @OneToMany(mappedBy = "modulo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Transaccion> transacciones;
}
