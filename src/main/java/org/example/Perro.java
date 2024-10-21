package org.example;

public class Perro implements Especie {

    @Override
    public String imprimirEspecie() {
        return "Perro";
    }

    @Override
    public String cuidadosEspeciales() {
        return "Cuidados para un perro: Paseos diarios, vacunas, alimentación balanceada...";

    }
}
