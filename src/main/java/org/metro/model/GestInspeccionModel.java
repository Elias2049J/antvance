package org.metro.model;

import org.metro.test.entity.Inspeccion;
import org.metro.usecase.InspeccionesUseCase;

import java.util.Date;

public class GestInspeccionModel extends GestionModel implements InspeccionesUseCase {

    @Override
    public boolean mostrarMenu() {
        int opcionParaSeguir;
        do {
            //imprime el menú
            imprimirMenu();
            //obtiene la eleccion del usuario
            opcionParaSeguir = obtenerEleccion(sc, 5);
            //ejecuta el usecase seleccionado
            manejarOpcion(opcionParaSeguir);
        } while (opcionParaSeguir != 4);
        return false;
    }

    @Override
    public boolean imprimirMenu () {
        System.out.println("┌───────────────────────────────────────────┐");
        System.out.println("│     'Gestión General de Inspecciones'     │");
        System.out.println("├───────────────────────────────────────────┤");
        System.out.println("│ 1. Registrar nueva Inspeccion             │");
        System.out.println("│ 2. Historial de inspecciones              │");
        System.out.println("│ 3. Administrar Inspecciones               │");
        System.out.println("│ 4. Listar Vehículos                       │");
        System.out.println("│ 5. Volver Atrás                           │");
        System.out.println("└───────────────────────────────────────────┘");
        return false;
    }

    @Override
    public boolean registrarInspeccion() {
        System.out.println("Ingrese los datos de la inspeccion: \n");
        System.out.println("Tipo de inspección:");
        String tipoInspeccion = sc.next();
        sc.nextLine();
        System.out.println("Kilometraje registrado:");
        Integer kilometraje = sc.nextInt();
        sc.nextLine();
        System.out.println("Resultado:");
        String resultado = sc.nextLine();
        System.out.println("Detalle la observación:");
        String observacion = sc.nextLine();

        //para registrar una nueva inspeccion se tiene que instanciar la clase Inspeccion con el nombre que queramos
        // y se le pasan todos los argumentos al cosntructor
        Inspeccion nuevaInspeccion = new Inspeccion(dataInspeccion.getListaObjetos().getLast().getId_inspeccion()+1, tipoInspeccion, new Date(), kilometraje, resultado, observacion);
        dataInspeccion.agregar(nuevaInspeccion);
        System.out.println("Se ha registrado correctamente la inspección: \n");
        System.out.println(nuevaInspeccion);
        return true;
    }

    @Override
    public boolean verHistorial() {
        imprimirHistorial();
        for (var inspeccion : dataInspeccion.getListaObjetos()) {
            System.out.println(inspeccion);
        }
        return true;
    }

    @Override
    public boolean administrarInspecciones() {
        return false;
    }

    @Override
    public boolean listarVehiculos() {
        return false;
    }

    @Override
    public void manejarOpcion(int eleccion) {
        switch (eleccion) {
            case 1:
                //usecase de propio de la clase
                registrarInspeccion();
                break;
            case 2:
                //method de la superclase
                verHistorial();
                break;
            case 3:

                break;
            case 4:
                break;
            case 5:
                //SE SALE DEL PROGRAMA
                System.out.println("Saliendo al menú principal");
                break;
        }
    }
}
