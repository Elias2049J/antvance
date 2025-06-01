package org.metro.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "modulo")
public class Modulo {
    @Id
    protected Integer id_modulo;
    private String tipo_modulo;

    @ManyToOne
    @JoinColumn(name = "id_modulo")
    Estacion estacion;
}
