package org.metro.model;

import java.util.Scanner;

public class MenuModel extends GestionModel{
    Scanner sc = new Scanner(System.in);

    @Override
    public void mostrarMenu() {
        int opcionParaSeguir = 0;
        do {
            System.out.println("┌───────────────────────────────────────────┐");
            System.out.println("│            'SISTEMA ANTVANCE'             │");
            System.out.println("├───────────────────────────────────────────┤");
            System.out.println("│ 1. Gestionar Inspecciones                 │");
            System.out.println("│ 2. Gestionar Rutas y Viajes               │");
            System.out.println("│ 3. Gestionar Registros de Transacciones   │");
            System.out.println("│ 4. Salir                                  │");
            System.out.println("└───────────────────────────────────────────┘");

            while (true) {
                System.out.print("Elija una opción: ");
                if (sc.hasNextInt()) {
                    //opcionParaSeguir es la variable donde se guarda la opción que ingrese el usuario
                    opcionParaSeguir = sc.nextInt();
                    if (opcionParaSeguir >= 1 && opcionParaSeguir <= 4) {
                        sc.nextLine();
                        break; // ROMPER BUCLE SI INGRESA UN NÚMERO VÁLIDO
                    } else {
                        System.out.println("Ingrese una opción válida");
                    }
                } else {
                    System.out.println("Entrada inválida. Por favor, ingrese solo números enteros del 1 al 7.");
                    sc.next();
                }
            }

            //Switch para elegir opciones
            switch (opcionParaSeguir) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    //SE SALE DEL PROGRAMA
                    System.out.println("Saliendo del Programa");
                    break;
            }
        } while (opcionParaSeguir != 4);
    }

    @Override
    public boolean verHistorial() {
        return false;
    }
}
