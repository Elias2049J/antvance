package org.metro.application.model;

import org.metro.application.usecase.RutaViajeUseCase;


public class RutaViajeModel extends GestionModel implements RutaViajeUseCase {

    @Override
    public boolean planificarRuta() {
//        System.out.println("Ingrese el número de licencia del chofer: \n");
//        Chofer chofer = dataChofer.getObjetoById(licencia);
//
//        System.out.println("Placa de vehículo a asignar: ");
//        Vehiculo vehiculo = dataVehiculo.getObjetoById(placa);
//        System.out.println("Ruta a asignar:");
//
//        Ruta ruta = dataRuta.getObjetoById(id_ruta);
//        System.out.println("Hora de salida de la estación: ");
//
//        //para modificar los datos de un chofer se tiene que buscar en la lista por la "placa"
//        // y se le pasan los nuevos argumentos al chofer y al vehículo
//        System.out.println("Se ha asignado la ruta con éxito para el chofer:"+dataChofer.getObjetoById(licencia).getNombre()+"\n");
        return true;
    }

    @Override
    public boolean verRegistroConductores() {
        return false;
    }
}
