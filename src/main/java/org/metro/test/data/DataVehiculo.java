package org.metro.test.data;

import org.metro.test.entity.Vehiculo;

public class DataVehiculo extends DataAntvance<Vehiculo, String>{
    @Override
    public void precargarDatos() {
        agregar(new Vehiculo("ABC-123", "E-titan", "Scania", 2024));
        agregar(new Vehiculo("DEF-456", "Iron-bus", "Modasa", 2021));
        agregar(new Vehiculo("GHI-789", "Hermes", "Modasa", 2021));
        agregar(new Vehiculo("JKL-012", "Apolo", "Scania", 2022));
        agregar(new Vehiculo("MNO-345", "Hermes", "Modasa", 2020));
        agregar(new Vehiculo("PQR-678", "E-titan", "Scania", 2023));
        agregar(new Vehiculo("STU-901", "Hermes", "Modasa", 2021));
        agregar(new Vehiculo("VWX-234", "Apolo", "Scania", 2022));
        agregar(new Vehiculo("YZA-567", "E-titan", "Scania", 2022));
        agregar(new Vehiculo("BCD-890", "Iron-bus", "Modasa", 2022));
    }

    @Override
    public Vehiculo getObjetoById(String s) {
        for (Vehiculo vehiculo: getListaObjetos()){
            if (vehiculo.getPlaca().equals(s)) {
                return vehiculo;
            }
        }
        return null;
    }
}
