package org.example;

public class Empleado extends Usuario {

    private static Empleado instancia;

    private Empleado(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public static Empleado getInstancia(String nombre, String apellido ) {
        if (instancia == null) {
            instancia = new Empleado(nombre, apellido);
        }
        return instancia;
    }

    public Adopcion registrarAdopcion(Adoptante adoptante,Mascota mascota, Veterinaria laVeterinaria ) throws RuntimeException {
        //Toda esta logica debe ir en veterinaria
        if (laVeterinaria.getMascotas().stream().map(Mascota::getNombre).toList().contains(mascota.getNombre()) &&
            laVeterinaria.getAdopciones().contains(adoptante)){
            laVeterinaria.getAdopciones().add(new Adopcion(adoptante, mascota, this));
        }else {
            throw new RuntimeException("No se puede registrar nueva adopcion");
        }
        return new Adopcion(adoptante, mascota, this);
    }

}
