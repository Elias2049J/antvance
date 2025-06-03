package org.metro.infraestructure.adapter.salida;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Scanner;

@NoArgsConstructor
public class InspeccionRenderer {

    private final Scanner sc = new Scanner(System.in);

    public String[] recogerDatos() {
        String[] datos = new String[6];

        // tipo (no vacío)
        while (true) {
            System.out.print("Ingrese el tipo de inspección: ");
            String tipo = sc.nextLine().trim();
            if (!tipo.isEmpty()) {
                datos[0] = tipo;
                break;
            } else {
                System.out.println("El tipo de inspección no puede estar vacío.");
            }
        }

        // la fecha se genera automaticamente
        datos[1] = LocalDate.now().toString();

        // kilometraje (entero positivo)
        while (true) {
            System.out.print("Ingrese el kilometraje (entero positivo): ");
            String input = sc.nextLine();
            try {
                int km = Integer.parseInt(input);
                if (km >= 0) {
                    datos[2] = input;
                    break;
                } else {
                    System.out.println("El kilometraje debe ser un número positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Kilometraje inválido. Debe ser un número entero.");
            }
        }

        // resultado (solo "APTO" o "NO APTO")
        while (true) {
            System.out.print("Ingrese el resultado de la inspección (APTO/NO APTO): ");
            String resultado = sc.nextLine().trim();
            if (resultado.equalsIgnoreCase("APTO") || resultado.equalsIgnoreCase("NO APTO")) {
                datos[3] = resultado;
                break;
            } else {
                System.out.println("Resultado inválido. Debe ser 'APTO' o 'NO APTO'.");
            }
        }

        // observacion (puede estar vacío)
        System.out.print("Ingrese una observación: ");
        datos[4] = sc.nextLine().trim();

        return datos;
    }
}