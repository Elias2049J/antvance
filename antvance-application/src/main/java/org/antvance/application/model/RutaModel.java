package org.antvance.application.model;


import org.antvance.domain.entity.Ruta;

import java.util.List;

public class RutaModel extends GestionModel<Ruta, String> {

    @Override
    public Ruta crear(Ruta dto) {
        return null;
    }

    @Override
    public Ruta actualizar(String s, Ruta dto) {
        return null;
    }

    @Override
    public boolean eliminar(String s) {
        return false;
    }

    @Override
    public Ruta obtenerPorId(String s) {
        return null;
    }

    @Override
    public List<Ruta> listarTodos() {
        return List.of();
    }
}
