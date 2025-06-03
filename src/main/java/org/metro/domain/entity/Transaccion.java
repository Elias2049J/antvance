package org.metro.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id_transaccion;
    private Timestamp fecha_hora;

    //Muchos a uno con módulo
    @ManyToOne
    @JoinColumn(name = "id_modulo")
    private Modulo modulo;

    //Muchos a uno con tarjeta
    @ManyToOne
    @JoinColumn(name = "id_tarjeta")
    private Tarjeta tarjeta;
}
