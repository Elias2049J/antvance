package org.metro.model;

import org.metro.usecase.GestionModelUseCase;

import java.util.Scanner;

public class GestionModel implements GestionModelUseCase {
    Scanner sc = new Scanner(System.in);

    public boolean mostrarMenu() {
        int opcionParaSeguir;
        do {
            //imprime el menú
            imprimirMenu();
            //obtiene la eleccion del usuario
            opcionParaSeguir = obtenerEleccion(sc, 4);
            //ejecuta el usecase seleccionado
            manejarOpcion(opcionParaSeguir);
        } while (opcionParaSeguir != 4);
        return false;
    }

    public boolean imprimirMenu () {
        System.out.println("┌───────────────────────────────────────────┐");
        System.out.println("│            'SISTEMA ANTVANCE'             │");
        System.out.println("├───────────────────────────────────────────┤");
        System.out.println("│ 1. Gestionar Inspecciones                 │");
        System.out.println("│ 2. Gestionar Rutas y Viajes               │");
        System.out.println("│ 3. Gestionar Registros de Transacciones   │");
        System.out.println("│ 4. Salir                                  │");
        System.out.println("└───────────────────────────────────────────┘");
        return false;
    }

    public int obtenerEleccion(Scanner sc, int opcionMaxima) {
        int eleccion;
        while (true) {
            System.out.print(("Elija una opción: "));

            //Valida el caracter ingresado
            if (sc.hasNextInt()) {
                //captura el entero ingresado como eleccion
                eleccion = sc.nextInt();
                if(eleccion >= 1 && eleccion <= opcionMaxima) {
                    sc.nextLine();
                    break;
                } else {
                    System.out.println("Ingrese una opción válida");
                }
                //Si la elección no es una opción válida, muestra mensaje
            } else {
                System.out.println("Entrada inválida. Ingrese una opción de la lista");
            }
        }
        return eleccion;
    }

    public void manejarOpcion(int eleccion) {
        switch (eleccion) {
            case 1:
                GestInspeccionModel gestInspeccionModel = new GestInspeccionModel();
                gestInspeccionModel.mostrarMenu();
                break;
            case 2:
                GestRutasModel gestRutasModel = new GestRutasModel();
                gestRutasModel.mostrarMenu();
                break;
            case 3:
                break;
            case 4:
                //SE SALE DEL PROGRAMA
                System.out.println("Saliendo del Programa");
                break;
        }
    }

    @Override
    public boolean verHistorial() {
        return false;
    }

    public boolean imprimirHistorial () {
        System.out.println("┌───────────────────────────────────────────┐");
        System.out.println("│               Historial                   │");
        System.out.println("├───────────────────────────────────────────┤");

        return false;
    }
}
