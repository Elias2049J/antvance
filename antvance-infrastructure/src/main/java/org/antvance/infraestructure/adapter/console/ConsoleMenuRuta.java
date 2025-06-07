package org.antvance.infraestructure.adapter.console;

import lombok.AllArgsConstructor;
import org.antvance.application.port.inbound.ConsoleStrategy;

import java.util.Map;

@AllArgsConstructor
public class ConsoleMenuRuta extends ConsoleAdapter{
    private ConsoleStrategy menuAnterior;

    @Override
    public String getTitle() {
        return "Gestionar Rutas y Viajes";
    }

    @Override
    public Map<Integer, String> obtenerOpciones() {
        return Map.of(
                5, "Salir",
                4, "Volver atrás",
                3, "Ver Registro de Conductores",
                2, "Historial de Rutas y Viajes",
                1, "Planificar Rutas");
    }

    @Override
    public ConsoleStrategy manejarOpcion(int opcion) {
        return switch(opcion) {
            case 1 -> null;
            case 2 -> null;
            case 3 -> null;
            case 4 -> menuAnterior;
            case 5 -> null;
            default -> this;
        };
    }
}
