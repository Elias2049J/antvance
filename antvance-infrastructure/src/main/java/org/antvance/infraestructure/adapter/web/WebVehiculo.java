package org.antvance.infraestructure.adapter.web;

import lombok.AllArgsConstructor;
import org.antvance.application.model.VehiculoModel;
import org.antvance.domain.entity.Vehiculo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/vehiculo")
public class WebVehiculo extends WebAdapter<Vehiculo, String> {

    private final VehiculoModel vehiculoModel;

    @Override
    @PostMapping("/crear")
    public Vehiculo crear(@RequestBody Vehiculo dto) {
        return vehiculoModel.crear(dto);
    }

    @Override
    @PutMapping("/actualizar/{placa}")
    public Vehiculo actualizar(@PathVariable String placa, @RequestBody Vehiculo dto) {
        return vehiculoModel.actualizar(placa, dto);
    }

    @Override
    @DeleteMapping("/eliminar/{placa}")
    public boolean eliminar(@PathVariable String placa) {
        return vehiculoModel.eliminar(placa);
    }

    @Override
    @GetMapping("/obtener/{placa}")
    public Vehiculo obtenerPorId(@PathVariable String placa) {
        return vehiculoModel.obtenerPorId(placa);
    }

    @Override
    @GetMapping("/listar")
    public List<Vehiculo> listarTodos() {
        return vehiculoModel.listarTodos();
    }
}