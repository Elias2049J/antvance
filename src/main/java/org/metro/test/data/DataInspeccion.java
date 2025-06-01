package org.metro.test.data;

import org.metro.entity.Inspeccion;

import java.util.Date;
//clase concreta qeu sirve como estructura de datos para test
public class DataInspeccion extends DataAntvance<Inspeccion> {

    @Override
    public void precargarDatos() {
        //for para agregar datos dinámicamente en runtime
        for (int i = 1; i <= 10; i++) {
            Inspeccion inspeccion = new Inspeccion(
                    i, // id
                    "preventivo", // tipo
                    new Date(), // fecha actual en cada iteración
                    100 + i, // kilometraje
                    "Apto", // resultado
                    "bbservacion nro" + i // observacion
            );
            agregar(inspeccion);
        }
        for (int i = 11; i <= 20; i++) {
            Inspeccion inspeccion = new Inspeccion(
                    i, // id
                    "correctivo", // tipo
                    new Date(), // fecha actual en cada iteración
                    100 * i, // kilometraje
                    "No Apto", // resultado
                    "Observacion Nro" + i // observacion
            );
            agregar(inspeccion);
        }
    }
}
