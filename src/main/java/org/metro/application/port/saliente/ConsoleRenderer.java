package org.metro.application.port.saliente;

import org.metro.application.port.entrante.ConsoleStrategy;

public interface ConsoleRenderer {
    //Imprime un menú
    boolean imprimirMenu(ConsoleStrategy menu);
    int leerEleccion(ConsoleStrategy menu);
    //Para imprimir mensajes en la consola
    boolean imprimirMensaje(String mensaje);
    //Para imprimir cualquier tipo de iterables
    <T> boolean imprimirLista(Iterable<T> iterable);
}
