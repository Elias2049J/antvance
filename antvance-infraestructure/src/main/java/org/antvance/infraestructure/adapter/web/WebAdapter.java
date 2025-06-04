package org.antvance.infraestructure.adapter.web;

import org.antvance.application.port.inbound.web.WebPort;
import java.util.List;

public abstract class WebAdapter<T, ID> implements WebPort<T, ID> {

    @Override
    public abstract T crear(T dto);

    @Override
    public abstract T actualizar(ID id, T dto);

    @Override
    public abstract boolean eliminar(ID id);

    @Override
    public abstract T obtenerPorId(ID id);

    @Override
    public abstract List<T> listarTodos();
}