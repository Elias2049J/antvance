package org.metro.test;

import org.metro.application.context.ConsoleContext;
import org.metro.infraestructure.adapter.salida.ConsoleRendererImpl;
import org.metro.infraestructure.adapter.entrada.ConsoleMenuPrincipal;

public class Test {
    public static void main(String[] args) {
        ConsoleContext menu = new ConsoleContext(new ConsoleMenuPrincipal(), new ConsoleRendererImpl());
        menu.ejecutar();
    }
}
