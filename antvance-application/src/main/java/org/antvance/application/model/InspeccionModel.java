package org.antvance.application.model;

import lombok.AllArgsConstructor;
import org.antvance.application.port.outbound.InspeccionRepoPort;
import org.antvance.domain.entity.Inspeccion;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class InspeccionModel extends GestionModel<Inspeccion, Long> {

    private final InspeccionRepoPort inspeccionRepoPort;

    @Override
    public Inspeccion crear(Inspeccion dto) {
        return inspeccionRepoPort.guardar(dto);
    }

    @Override
    public Inspeccion actualizar(Long along, Inspeccion dto) {
        return inspeccionRepoPort.actualizar(along, dto);
    }

    @Override
    public boolean eliminar(Long aLong) {
        return inspeccionRepoPort.eliminar(aLong);
    }

    @Override
    public Inspeccion obtenerPorId(Long aLong) {
        return null;
    }

    @Override
    public List<Inspeccion> listarTodos() {
        return List.of();
    }
}
