package org.metro.infraestructure.adapter.entrada;

import org.metro.application.port.entrante.ConsoleStrategy;

import java.util.Map;

public class ConsoleMenuPrincipal extends ConsoleAdapter {

    @Override
    public String getTitle() {
        return "Menú Principal";
    }

    @Override
    public Map<Integer, String>obtenerOpciones() {
        return Map.of(
                4, "Salir",
                3, "Gestionar Registros de Transacciones",
                2, "Gestionar Rutas y Viajes",
                1, "Gestionar Inspecciones"
        );
    }

    //Según la opción elegida por el usuario,
    // creará una instancia del menú requerido
    @Override
    public ConsoleStrategy manejarOpcion(int opcion) {
        return switch(opcion) {
            //el menu anterior a los submenú es this
            case 1 -> new ConsoleMenuInspeccion(this);
            case 2 -> new ConsoleMenuRuta(this);
            case 3 -> new ConsoleMenuTransaccion(this);
            case 4 -> null;
            default -> this;
        };
    }
}
