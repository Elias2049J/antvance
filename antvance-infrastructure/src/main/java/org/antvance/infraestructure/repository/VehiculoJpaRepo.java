package org.antvance.infraestructure.repository;

import org.antvance.domain.entity.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoJpaRepo extends JpaRepository<Vehiculo, String> {
}
