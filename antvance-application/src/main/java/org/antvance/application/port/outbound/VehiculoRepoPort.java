package org.antvance.application.port.outbound;

import org.antvance.domain.entity.Inspeccion;
import org.antvance.domain.entity.Vehiculo;

import java.util.List;

public interface VehiculoRepoPort {
    Vehiculo guardar(Vehiculo vehiculo);
    Vehiculo actualizar(String placa, Vehiculo vehiculo);
    boolean eliminar(String placa);
    Vehiculo obtenerPorId(String placa);
    List<Vehiculo> listarTodos();
}
