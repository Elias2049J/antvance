package org.metro.test.data;

import org.metro.entity.Ruta;

public class DataRuta extends DataAntvance<Ruta> {

    @Override
    public void precargarDatos() {
        //for para agregar datos dinámicamente en runtime
        Ruta ruta1 = new Ruta('A', "Terminal Naranjal", "Estacion Central");
        Ruta ruta2 = new Ruta('B', "Estacion los Incas", "Plaza de Flores");
        Ruta ruta3 = new Ruta('C', "Estación Ramon Castilla", "Terminal Matellini");
        Ruta ruta4 = new Ruta('D', "Terminal Naranjal", "Estacion Central");
        agregar(ruta1);
        agregar(ruta2);
        agregar(ruta3);
        agregar(ruta4);
    }
}
