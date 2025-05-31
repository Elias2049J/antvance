package org.metro.ejemplo;

public class Gato extends Animal {

    @Override
    public String respirar() {
        return "El gato está respirando";
    }

    @Override
    public String ruido() {
        return "miaw";
    }

    @Override
    public String mover() {
        return "El gato se está moviendo";
    }
}
