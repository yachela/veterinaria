package org.example;

import java.util.Date;

public class Mascota {
    private String nombre;
    private Date fechaNacimiento;
    private float peso;
    private Especie especie;

    public Mascota(String nombre, Date fechaNacimiento, float peso, Especie especie) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public Especie getEspecie() {
        return especie;
    }
    public void setEspecie(Especie especie) {
        this.especie = especie;
    }


}
