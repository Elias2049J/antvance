package org.metro.model;

import org.metro.test.data.DataRuta;
import org.metro.test.data.DataViaje;

public class GestRutasModel extends GestionModel {

    DataRuta dataRuta = new DataRuta();
    DataViaje dataViaje = new DataViaje();

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
        System.out.println("│ 1. Planificar Rutas                       │");
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
}
