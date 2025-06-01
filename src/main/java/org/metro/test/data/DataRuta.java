package org.metro.test.data;

import org.metro.test.entity.Ruta;

public class DataRuta extends DataAntvance<Ruta, String> {

    public DataRuta() {
        precargarDatos();
    }

    @Override
    public void precargarDatos() {
        //for para agregar datos dinámicamente en runtime
        agregar(new Ruta("A", "Terminal Naranjal", "Estacion Central"));
        agregar(new Ruta("B", "Estacion los Incas", "Plaza de Flores"));
        agregar(new Ruta("C", "Estación Ramon Castilla", "Terminal Matellini"));
        agregar(new Ruta("D", "Terminal Naranjal", "Estacion Central"));
    }

    @Override
    public Ruta getObjetoById(String s) {
        for(Ruta ruta: getListaObjetos()){
            if (ruta.getId_ruta().equals(s)){
                return ruta;
            }
        }
        return null;
    }
}
