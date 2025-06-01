package org.metro.test.data;

import org.metro.test.entity.Viaje;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;

public class DataViaje extends DataAntvance<Viaje, Integer>{

    public DataViaje() {
        precargarDatos();
    }

    @Override
    public void precargarDatos() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            agregar(new Viaje(1, sdf.parse("2025-05-01"), LocalTime.parse("06:00:00"), LocalTime.parse("08:00:00"), "Sin observaciones", "A12345678"));
            agregar(new Viaje(2, sdf.parse("2025-05-01"), LocalTime.parse("09:00:00"), LocalTime.parse("11:00:00"), "Retraso debido a tráfico intenso en la ruta B", "B23456789"));
            agregar(new Viaje(3, sdf.parse("2025-05-02"), LocalTime.parse("07:30:00"), LocalTime.parse("09:30:00"), "Frenos defectuosos, se reportó a mantenimiento", "C34567890"));
            agregar(new Viaje(4, sdf.parse("2025-05-03"), LocalTime.parse("10:00:00"), LocalTime.parse("12:00:00"), "Viaje sin novedades, todo en orden", "D45678901"));
            agregar(new Viaje(5, sdf.parse("2025-05-04"), LocalTime.parse("12:30:00"), LocalTime.parse("14:30:00"), "Problemas de visibilidad por lluvia intensa", "E56789012"));
            agregar(new Viaje(6, sdf.parse("2025-05-05"), LocalTime.parse("13:00:00"), LocalTime.parse("15:00:00"), "Viaje de prueba de la ruta B, sin contratiempos", "F67890123"));
            agregar(new Viaje(7, sdf.parse("2025-05-06"), LocalTime.parse("14:00:00"), LocalTime.parse("16:00:00"), "Parada no planificada en la estación Ramón Castilla por una falla técnica", "G78901234"));
            agregar(new Viaje(8, sdf.parse("2025-05-07"), LocalTime.parse("15:30:00"), LocalTime.parse("17:30:00"), "Retraso por desvío temporal debido a trabajos en la carretera", "H89012345"));
            agregar(new Viaje(9, sdf.parse("2025-05-08"), LocalTime.parse("16:00:00"), LocalTime.parse("18:00:00"), "Viaje rápido y sin problemas, todo en orden", "I90123456"));
            agregar(new Viaje(10, sdf.parse("2025-05-09"), LocalTime.parse("17:00:00"), LocalTime.parse("19:00:00"), "Salida retrasada por problemas con el sistema de pago en la estación", "J01234567"));
        } catch (ParseException e) {
            System.out.println(e.getMessage());;
        }
    }

    @Override
    public Viaje getObjetoById(Integer integer) {
        return null;
    }
}
