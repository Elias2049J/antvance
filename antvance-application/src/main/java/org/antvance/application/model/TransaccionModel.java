package org.antvance.application.model;

import org.antvance.domain.entity.Transaccion;

import java.util.List;

public class TransaccionModel extends GestionModel<Transaccion, Long>{
    @Override
    public Transaccion crear(Transaccion dto) {
        return null;
    }

    @Override
    public Transaccion actualizar(Long aLong, Transaccion dto) {
        return null;
    }

    @Override
    public boolean eliminar(Long aLong) {
        return false;
    }

    @Override
    public Transaccion obtenerPorId(Long aLong) {
        return null;
    }

    @Override
    public List<Transaccion> listarTodos() {
        return List.of();
    }
}
