package org.antvance.application.port.outbound;

import org.antvance.application.port.inbound.CrudPort;
import org.antvance.domain.entity.Vehiculo;

public interface VehiculoRepoPort extends CrudPort<Vehiculo, String> {
}
