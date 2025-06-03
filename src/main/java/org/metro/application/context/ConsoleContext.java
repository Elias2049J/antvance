package org.metro.application.context;

import org.metro.application.port.saliente.ConsoleRenderer;
import org.metro.application.port.entrante.ConsoleStrategy;

//Clase de orquestación para menús de consola
public class ConsoleContext extends Context<ConsoleStrategy, ConsoleRenderer> {

    //El constructor debe llamar a los atributos de los super
    // porque lombok no genera constructor con args en las subclases
    public ConsoleContext(ConsoleStrategy strategy, ConsoleRenderer renderer) {
        super(strategy, renderer);
    }

    //para renderizar cada menú especificado por el usuario
    @Override
    public void ejecutar() {
        while (strategy != null) {
            //le dice al renderizador que imprima el menú requerido por el usuario
            renderer.imprimirMenu(strategy);
            //lee la opción del usuario
            int opcion = renderer.leerEleccion(strategy);
            //se le asigna una estrategia(menu)
            strategy = strategy.manejarOpcion(opcion);
        }
    }
}
