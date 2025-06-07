package org.antvance.infraestructure.adapter.persistence;

import org.antvance.application.port.outbound.VehiculoRepoPort;
import org.antvance.domain.entity.Vehiculo;
import org.antvance.infraestructure.repository.VehiculoJpaRepo;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class VehiculoRepoAdapter implements VehiculoRepoPort {

    private final VehiculoJpaRepo vehiculoJpaRepo;

    public VehiculoRepoAdapter(VehiculoJpaRepo vehiculoJpaRepo) {
        this.vehiculoJpaRepo = vehiculoJpaRepo;
    }

    @Override
    public Vehiculo crear(Vehiculo vehiculo) {
        return vehiculoJpaRepo.save(vehiculo);
    }

    @Override
    public Vehiculo actualizar(String placa, Vehiculo vehiculo) {
        return null;
    }

    @Override
    public boolean eliminar(String placa) {
        return false;
    }

    @Override
    public Vehiculo obtenerPorId(String placa) {
        return null;
    }

    @Override
    public List<Vehiculo> listarTodos() {
        return List.of();
    }
}
