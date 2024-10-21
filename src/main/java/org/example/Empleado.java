package org.example;

public class Empleado extends Usuario {

    private static Empleado instancia;

    public Empleado(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public static Empleado getInstancia(String nombre, String apellido ) {
        if (instancia == null) {
            instancia = new Empleado(nombre, apellido);
        }
        return instancia;
    }

}
