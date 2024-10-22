package org.example;

import java.util.Date;

public class Mascota {
    private String nombre;
    private Date fechaNacimiento;
    private Float peso;
    protected String especie;
    private String cuidados;

    public Mascota(String nombre, Date fechaNacimiento, Float peso, String especie, String cuidados) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.especie = especie;
        this.cuidados = cuidados;
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
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getCuidados() {
        return cuidados;
    }
    public void setCuidados(String cuidados) {
        this.cuidados = cuidados;
    }



}
