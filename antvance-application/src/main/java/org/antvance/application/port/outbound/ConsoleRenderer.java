package org.antvance.application.port.outbound;

import org.antvance.application.port.inbound.ConsoleStrategy;

public interface ConsoleRenderer {
    //Imprime un menú
    boolean imprimirMenu(ConsoleStrategy menu);
    int leerEleccion(ConsoleStrategy menu);
    //Para imprimir mensajes en la consola
    boolean imprimirMensaje(String mensaje);
    //Para imprimir cualquier tipo de iterables
    <T> boolean imprimirLista(Iterable<T> iterable);
}
