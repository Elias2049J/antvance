package org.antvance.infraestructure.repository;

import org.antvance.domain.entity.Inspeccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InspeccionJpaRepo extends JpaRepository<Inspeccion, Long> {
}