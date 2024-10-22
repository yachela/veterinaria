package org.example;

import javax.swing.*;

public class Ticket {

    public void imprimir(Empleado empleado, Adoptante adoptante, Mascota mascota) {

        String ticket = "***** Ticket de Adopción *****\n" +
                "Empleado encargado: " + empleado.getNombre() + "\n" +
                "Adoptante: " + adoptante.getNombre() + "\n" +
                "Edad del adoptante: " + adoptante.getEdad() + "\n" +
                "Dirección del adoptante: " + adoptante.getDireccion() + "\n" +
                "Mascota adoptada: " + mascota.getNombre() + "\n" +
                "Especie: " + mascota.getEspecie() + "\n" +
                "Recomendaciones de cuidados: " + mascota.getCuidados() + "\n" +
                "Peso: " + mascota.getPeso() + " kg\n" +
                "Fecha de nacimiento: " + mascota.getFechaNacimiento() + "\n" +
                "******************************";

        JOptionPane.showMessageDialog(null, ticket, "Ticket de Adopción", JOptionPane.INFORMATION_MESSAGE);
    }

}
