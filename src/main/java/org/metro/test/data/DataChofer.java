package org.metro.test.data;

import org.metro.test.entity.Chofer;

public class DataChofer extends DataAntvance<Chofer, String>{

    public DataChofer(){
        precargarDatos();
    }

    @Override
    public void precargarDatos() {
        for (int i = 0; i < 10; i++) {
            agregar(new Chofer("A12345678", "José Luis", "Pérez Morales", 40, "ABC-123"));
            agregar(new Chofer("B23456789", "Marta Isabel", "Sánchez Rodríguez", 45, "DEF-456"));
            agregar(new Chofer("C34567890", "Juan Carlos", "Gómez Martínez", 38, "GHI-789"));
            agregar(new Chofer("D45678901", "Laura Beatriz", "Rodríguez Hernández", 42, "JKL-012"));
            agregar(new Chofer("E56789012", "Luis Alberto", "García López", 50, "MNO-345"));
            agregar(new Chofer("F67890123", "Ana María", "Pérez Fernández", 36, "PQR-678"));
            agregar(new Chofer("G78901234", "Pedro José", "Díaz Morales", 44, "STU-901"));
            agregar(new Chofer("H89012345", "Sara Elena", "Martínez Luna", 39, "VWX-234"));
            agregar(new Chofer("I90123456", "José Antonio", "López Ramírez", 48, "YZA-567"));
            agregar(new Chofer("J01234567", "Carmen Teresa", "López Vega", 41, "BCD-890"));
        }
    }

    @Override
    public Chofer getObjetoById(String id) {
        for (Chofer chofer: getListaObjetos()){
            if (chofer.getNro_licencia().equals(id)) {
                return chofer;
            }
        }
        return null;
    }
}
