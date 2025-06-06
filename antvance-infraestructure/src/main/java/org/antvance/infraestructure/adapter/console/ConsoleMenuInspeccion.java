package org.antvance.infraestructure.adapter.console;

import lombok.AllArgsConstructor;
import org.antvance.application.port.inbound.ConsoleStrategy;

import java.util.Map;

@AllArgsConstructor
public class ConsoleMenuInspeccion extends ConsoleAdapter {
    private ConsoleStrategy menuAnterior;
    @Override
    public String getTitle() {
        return "Gestión de Inspecciones";
    }

    @Override
    public Map<Integer, String> obtenerOpciones() {
        return Map.of(
                6, "Salir",
                5, "Volver atrás",
                4, "Listar Vehículos por Filtro",
                3, "Administrar Inspecciones",
                2, "Historial de Inspecciones",
                1, "Registrar Nueva Inspección"
        );
    }

    @Override
    public ConsoleStrategy manejarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                InspeccionRenderer inspeccionRenderer = new InspeccionRenderer();
                inspeccionRenderer.recogerDatos();
                return this;
            case 2:
            case 3:
            case 4:
                return null;
            case 5:
                return menuAnterior;
            default:
                return this;
        }
    }
}
