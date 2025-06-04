package org.antvance.infraestructure.adapter.web;

import lombok.AllArgsConstructor;
import org.antvance.application.model.InspeccionModel;
import org.antvance.domain.entity.Inspeccion;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/inspeccion")
public class WebInspeccion extends WebAdapter<Inspeccion, Long>{

    private final InspeccionModel inspeccionModel;

    @Override
    @PostMapping("/crear")
    public Inspeccion crear(@RequestBody Inspeccion dto) {
        return inspeccionModel.crear(dto);
    }

    @Override
    @PutMapping("/actualizar/{id}")
    public Inspeccion actualizar(@PathVariable Long id,@RequestBody Inspeccion dto) {
        return null;
    }

    @Override
    @DeleteMapping("/eliminar/{id}")
    public boolean eliminar(@PathVariable Long id) {
        return false;
    }

    @Override
    @GetMapping("/obtener/{id}")
    public Inspeccion obtenerPorId(@PathVariable Long id) {
        return null;
    }

    @Override
    @GetMapping("/listar")
    public List<Inspeccion> listarTodos() {
        return List.of();
    }
}
