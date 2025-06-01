package org.metro.model;

import org.metro.test.entity.Chofer;
import org.metro.test.entity.Ruta;
import org.metro.test.entity.Vehiculo;
import org.metro.usecase.RutasUseCase;

import java.time.LocalTime;


public class GestRutasModel extends GestionModel implements RutasUseCase {

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
        System.out.println("│ 1. Asignar Rutas                          │");
        System.out.println("│ 2. Historial de rutas y viajes            │");
        System.out.println("│ 3. Ver registro de conductores            │");
        System.out.println("│ 4. Volver Atrás                           │");
        System.out.println("└───────────────────────────────────────────┘");
        return false;
    }

    @Override
    public void manejarOpcion(int eleccion){
        switch (eleccion) {
            case 1:
                break;
            case 2:
                verHistorial();
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
        imprimirHistorial();
        for (var ruta : dataRuta.getListaObjetos()) {
            System.out.println(ruta);
        }
        for (var viaje : dataViaje.getListaObjetos()) {
            System.out.println(viaje);
        }
        return true;
    }

    @Override
    public boolean planificarRuta() {
        System.out.println("Ingrese el número de licencia del chofer: \n");
        String licencia = sc.next();
        Chofer chofer = dataChofer.getObjetoById(licencia);

        System.out.println("Placa de vehículo a asignar: ");
        String placa = sc.next();
        Vehiculo vehiculo = dataVehiculo.getObjetoById(placa);
        sc.nextLine();
        System.out.println("Ruta a asignar:");

        String id_ruta = sc.next();
        Ruta ruta = dataRuta.getObjetoById(id_ruta);
        sc.nextLine();
        System.out.println("Hora de salida de la estación: ");
        LocalTime hora_salida = LocalTime.parse(sc.next());

        //para modificar los datos de un chofer se tiene que buscar en la lista por la "placa"
        // y se le pasan los nuevos argumentos al chofer y al vehículo
        System.out.println("Se ha asignado la ruta con éxito para el chofer:"+dataChofer.getObjetoById(licencia).getNombre()+"\n");
        return true;
    }

    @Override
    public boolean verRegistroConductores() {
        return false;
    }
}
