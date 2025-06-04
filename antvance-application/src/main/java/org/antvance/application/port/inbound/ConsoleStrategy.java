package org.antvance.application.port.inbound;

import java.util.Map;

public interface ConsoleStrategy {
    //Para obtener el título del menú
    String getTitle();
    //Diccionario (clave, valor) para las opciones de cada menú
    Map<Integer, String> obtenerOpciones();
    //crea una instancia del menú requerido por el usuario según la opción
    ConsoleStrategy manejarOpcion(int opcion);
}
