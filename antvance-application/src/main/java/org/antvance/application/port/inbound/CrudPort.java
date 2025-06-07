package org.antvance.application.port.inbound;

import java.util.List;

public interface CrudPort<T, ID> {
    T crear(T dto);
    T actualizar(ID id, T dto);
    boolean eliminar(ID id);
    T obtenerPorId(ID id);
    List<T> listarTodos();
}