package org.antvance.infraestructure.adapter.console;

import lombok.AllArgsConstructor;
import org.antvance.application.port.inbound.ConsoleStrategy;

import java.util.Map;
@AllArgsConstructor
public class ConsoleMenuTransaccion extends ConsoleAdapter{
    private ConsoleStrategy menuAnterior;
    @Override
    public String getTitle() {
        return "Gestión de Transacciones";
    }

    @Override
    public Map<Integer, String> obtenerOpciones() {
        return Map.of(
                4, "Salir",
                3, "Volver Atrás",
                2, "Histórico",
                1, "Visualizar Reportes");
    }

    @Override
    public ConsoleStrategy manejarOpcion(int opcion) {
        return switch(opcion) {
            case 1 -> null;
            case 2 -> null;
            case 3 -> menuAnterior;
            case 4 -> null;
            default -> this;
        };
    }
}
