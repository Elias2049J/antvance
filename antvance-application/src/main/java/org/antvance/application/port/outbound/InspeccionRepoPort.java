package org.antvance.application.port.outbound;

import org.antvance.application.port.inbound.CrudPort;
import org.antvance.domain.entity.Inspeccion;

public interface InspeccionRepoPort extends CrudPort<Inspeccion, Long> {
}