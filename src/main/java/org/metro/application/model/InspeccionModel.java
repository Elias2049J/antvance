package org.metro.application.model;

import org.metro.application.usecase.InspeccionUseCase;

public class InspeccionModel extends GestionModel implements InspeccionUseCase {
    @Override
    public boolean registrarInspeccion() {
        return false;
    }

    @Override
    public boolean administrarInspecciones() {
        return false;
    }

    @Override
    public boolean listarVehiculos() {
        return false;
    }
}
