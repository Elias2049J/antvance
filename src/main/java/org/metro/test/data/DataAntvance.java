package org.metro.test.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
//Esta clase genérica sirve como plantilla
//para las clases que se usarán como estructuras de datos en el testing
public abstract class DataAntvance<T> {
    private List<T> listaObjetos = new ArrayList<>();

    //method para agregar un nuevo objeto a nuestra lista de objetos
    public boolean agregar (T objeto) {
        listaObjetos.add(objeto);
        return true;
    }

    public abstract void precargarDatos();

    public DataAntvance(){
        precargarDatos();
    }
}
