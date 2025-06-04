package org.antvance.application.model;

import lombok.AllArgsConstructor;
import org.antvance.application.port.outbound.VehiculoRepoPort;
import org.antvance.domain.entity.Vehiculo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class VehiculoModel extends GestionModel<Vehiculo, String>{

    private final VehiculoRepoPort vehiculoRepoPort;
    @Override
    public Vehiculo crear(Vehiculo dto) {
        return vehiculoRepoPort.guardar(dto);
    }

    @Override
    public Vehiculo actualizar(String s, Vehiculo dto) {
        return null;
    }

    @Override
    public boolean eliminar(String s) {
        return false;
    }

    @Override
    public Vehiculo obtenerPorId(String s) {
        return null;
    }

    @Override
    public List<Vehiculo> listarTodos() {
        return List.of();
    }
}
