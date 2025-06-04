package org.antvance.infraestructure.adapter.web;

import org.antvance.domain.entity.Ruta;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/ruta")
public class WebRuta extends WebAdapter<Ruta, String> {

    @Override
    @PostMapping("/crear")
    public Ruta crear(@RequestBody Ruta dto) {
        return null;
    }

    @Override
    @PutMapping("/actualizar/{id}")
    public Ruta actualizar(@PathVariable String id, @RequestBody Ruta dto) {
        return null;
    }

    @Override
    @DeleteMapping("/eliminar/{id}")
    public boolean eliminar(@PathVariable String id) {
        return false;
    }

    @Override
    @GetMapping("/obtener/{id}")
    public Ruta obtenerPorId(@PathVariable String id) {
        return null;
    }

    @Override
    @GetMapping("/listar")
    public List<Ruta> listarTodos() {
        return List.of();
    }
}