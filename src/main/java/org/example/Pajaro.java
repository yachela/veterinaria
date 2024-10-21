package org.example;

public class Pajaro implements Especie {

    @Override
    public String imprimirEspecie() {
        return "Pajaro";
    }

    @Override
    public String cuidadosEspeciales() {
        return "Cuidados para un pajaro: jaula, alimentacion...";
    }
}
