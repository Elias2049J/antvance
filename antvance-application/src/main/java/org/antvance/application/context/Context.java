package org.antvance.application.context;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//Clase genérica para orquestar el flujo de interaccion con el usuario, y el renderer
// Acepta diversos tipos de strategy y renderer
public abstract class Context<S, R> {
    protected S strategy;
    protected R renderer;

    public abstract void ejecutar();
}
