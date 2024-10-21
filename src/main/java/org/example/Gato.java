package org.example;

public class Gato implements Especie {

    @Override
    public String imprimirEspecie() {
        return "Gato";
    }

    @Override
    public String cuidadosEspeciales() {

        return "Cuidados para un gato: Rascadores, arenero limpio, alimentación...";

    }
}
