package org.example;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    private List<Adopcion> adopciones;
    private List<Mascota> mascotas;
    public Veterinaria() {
        adopciones = new ArrayList<>();
        mascotas = new ArrayList<>();
    }
    public List<Adopcion> getAdopciones() {
        return adopciones;
    }
    public void setAdopciones(List<Adopcion> adopciones) {
        this.adopciones = adopciones;
    }
    public List<Mascota> getMascotas() {
        return mascotas;
    }
    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

}
