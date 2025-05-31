package org.metro.ejemplo;

public class Perro extends Animal{

    @Override
    public String respirar() {
        return "El perro está respirando";
    }

    @Override
    public String ruido() {
        return "guau";
    }

    @Override
    public String mover() {
        return "El  perro mueve la cola";
    }
}
