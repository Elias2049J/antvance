package org.metro.test.data;

import org.metro.entity.Viaje;

import java.time.LocalTime;
import java.util.Date;

public class DataViaje extends DataAntvance<Viaje>{

    @Override
    public void precargarDatos() {
        LocalTime horaSalida = LocalTime.parse("06:00:00");
        LocalTime horaLlegada = LocalTime.parse("07:00:00");
        //for para agregar datos dinámicamente en runtime
        for (int i = 0; i < 10; i++) {
            horaSalida = horaSalida.plusMinutes(15);
            horaLlegada = horaLlegada.plusMinutes(15);

            Viaje viaje = new Viaje(i+1, new Date(), horaSalida, horaLlegada, "No hubo observaciones");
            agregar(viaje);
        }
        for (int i = 11; i < 20; i++) {
            horaSalida = horaSalida.plusMinutes(15);
            horaLlegada = horaLlegada.plusMinutes(15);

            Viaje viaje = new Viaje(i+1, new Date(), horaSalida, horaLlegada, "Retraso por tráfico");
            agregar(viaje);
        }
    }
}
