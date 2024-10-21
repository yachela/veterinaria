package org.example;

public class Adoptante extends Usuario {
    private String direccion;
    private int edad;
    public Adoptante(String nombre, String apellido, String
                     direccion, int edad) {
        super(nombre, apellido);
        this.direccion = direccion;
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

}
