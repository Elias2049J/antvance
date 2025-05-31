package org.metro.ejemplo;

public class EjemploMain {
    public static void main(String[] args) {
        Perro hitler = new Perro();
        Gato misifus = new Gato();
        Animal animal = new Animal();

        System.out.println(misifus.respirar());
        System.out.println(hitler.respirar());
        System.out.println(animal.respirar());
        System.out.println(misifus.mover());
        System.out.println(hitler.mover());
        System.out.println(animal.mover());
        System.out.println(misifus.ruido());
        System.out.println(hitler.ruido());
        System.out.println(animal.ruido());
    }
}
