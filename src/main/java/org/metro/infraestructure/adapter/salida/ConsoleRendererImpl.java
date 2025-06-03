package org.metro.infraestructure.adapter.salida;

import org.metro.application.port.entrante.ConsoleStrategy;
import org.metro.application.port.saliente.ConsoleRenderer;

import java.util.Map;
import java.util.Scanner;

public class ConsoleRendererImpl implements ConsoleRenderer {
    //Creamos un nuevo scanner de consola
    Scanner sc = new Scanner(System.in);

    //Imprime el título del menú y las opciones
    @Override
    public boolean imprimirMenu(ConsoleStrategy menu) {
        System.out.println("\n===== "+menu.getTitle()+"=====");
        //lambda para imprimir cada opción del menú con su número correspondeinte
        menu.obtenerOpciones().entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + ")" + entry.getValue()));
        System.out.print(">");
        return false;
    }

    //Este metodo parsea la entrada del scanner a int y la devuelve
    @Override
    public int leerEleccion(ConsoleStrategy menu) {
        //Bucle de validación
        while (true) {
            String input = sc.nextLine();
            try {
                int eleccion = Integer.parseInt(input);
                if (menu.obtenerOpciones().containsKey(eleccion)) {
                    return eleccion;
                } else {
                    System.out.print("Opción inválida. Elija una opción del menú: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Por favor, ingrese un número válido: ");
            }
        }
    }

    @Override
    public boolean imprimirMensaje(String mensaje) {
        return false;
    }

    @Override
    public <T> boolean imprimirLista(Iterable<T> iterable) {
        return false;
    }
}
