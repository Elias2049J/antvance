package org.antvance.infraestructure.adapter.persistence;

import org.antvance.application.port.outbound.InspeccionRepoPort;
import org.antvance.domain.entity.Inspeccion;
import org.antvance.infraestructure.repository.InspeccionJpaRepo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InspeccionRepoAdapter implements InspeccionRepoPort {

    private final InspeccionJpaRepo inspeccionJpaRepo;

    public InspeccionRepoAdapter(InspeccionJpaRepo inspeccionJpaRepo) {
        this.inspeccionJpaRepo = inspeccionJpaRepo;
    }

    @Override
    public Inspeccion guardar(Inspeccion inspeccion) {
        return inspeccionJpaRepo.save(inspeccion);
    }

    @Override
    public Inspeccion actualizar(Long id, Inspeccion inspeccion) {
        //Para manejar errores de valor nulo
        Optional<Inspeccion> existenteOpt = inspeccionJpaRepo.findById(id);
        if (existenteOpt.isPresent()) {
            Inspeccion existente = existenteOpt.get();
            existente.setTipo(inspeccion.getTipo());
            existente.setFecha(inspeccion.getFecha());
            existente.setKilometraje(inspeccion.getKilometraje());
            existente.setResultado(inspeccion.getResultado());
            existente.setObservacion(inspeccion.getObservacion());
            existente.setVehiculo(inspeccion.getVehiculo());
            return inspeccionJpaRepo.save(existente);
        }
        return null;
    }

    @Override
    public boolean eliminar(Long id) {
        if (inspeccionJpaRepo.existsById(id)) {
            inspeccionJpaRepo.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Inspeccion obtenerPorId(Long id) {
        Optional<Inspeccion> result = inspeccionJpaRepo.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Inspeccion> listarTodos() {
        return inspeccionJpaRepo.findAll();
    }
}