package org.antvance.infraestructure.adapter.web;

import lombok.AllArgsConstructor;
import org.antvance.application.model.VehiculoModel;
import org.antvance.domain.entity.Viaje;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/viaje")
public class WebViaje extends WebAdapter<Viaje, Long> {

    private final VehiculoModel vehiculoModel;

    @Override
    @PostMapping("/crear")
    public Viaje crear(@RequestBody Viaje dto) {
        return null;
    }

    @Override
    @PutMapping("/actualizar/{id}")
    public Viaje actualizar(@PathVariable Long id, @RequestBody Viaje dto) {
        return null;
    }

    @Override
    @DeleteMapping("/eliminar/{id}")
    public boolean eliminar(@PathVariable Long id) {
        return false;
    }

    @Override
    @GetMapping("/obtener/{id}")
    public Viaje obtenerPorId(@PathVariable Long id) {
        return null;
    }

    @Override
    @GetMapping("/listar")
    public List<Viaje> listarTodos() {
        return List.of();
    }
}