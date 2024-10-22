package org.example;

import java.util.Date;

public class Perro extends Mascota {

    public Perro(String nombre, Date fechaNacimiento, float peso ) {
        super(nombre, fechaNacimiento, peso,  "Perro", "Pasear 2 veces al dia");
    }
}

