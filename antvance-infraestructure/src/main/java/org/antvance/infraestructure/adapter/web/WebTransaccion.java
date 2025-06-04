package org.antvance.infraestructure.adapter.web;

import org.antvance.domain.entity.Transaccion;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/transaccion")
public class WebTransaccion extends WebAdapter<Transaccion, Long> {

    @Override
    @PostMapping("/crear")
    public Transaccion crear(@RequestBody Transaccion dto) {
        return null;
    }

    @Override
    @PutMapping("/actualizar/{id}")
    public Transaccion actualizar(@PathVariable Long id, @RequestBody Transaccion dto) {
        return null;
    }

    @Override
    @DeleteMapping("/eliminar/{id}")
    public boolean eliminar(@PathVariable Long id) {
        return false;
    }

    @Override
    @GetMapping("/obtener/{id}")
    public Transaccion obtenerPorId(@PathVariable Long id) {
        return null;
    }

    @Override
    @GetMapping("/listar")
    public List<Transaccion> listarTodos() {
        return List.of();
    }
}