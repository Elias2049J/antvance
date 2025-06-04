package org.antvance.application.port.outbound;

import org.antvance.domain.entity.Inspeccion;
import java.util.List;

public interface InspeccionRepoPort {
    Inspeccion guardar(Inspeccion inspeccion);
    Inspeccion actualizar(Long id, Inspeccion inspeccion);
    boolean eliminar(Long id);
    Inspeccion obtenerPorId(Long id);
    List<Inspeccion> listarTodos();
}