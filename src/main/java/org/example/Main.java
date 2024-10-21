package org.example;

import javax.swing.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
                JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
                JOptionPane.showMessageDialog(null, "Datos empleado");
                String nombreEmpleadoSesion = JOptionPane.showInputDialog("Ingrese su nombre");
                String apellidoEmpleadoSesion =JOptionPane.showInputDialog("Ingrese su apellido");


                Empleado empleado = Empleado.getInstancia(nombreEmpleadoSesion, apellidoEmpleadoSesion);

                JOptionPane.showMessageDialog(null, "Datos adoptante");
                String nombreAdoptante =JOptionPane.showInputDialog("Ingrese nombre adoptante");
                String apellidoAdoptante =JOptionPane.showInputDialog("Ingrese apellido adoptante");
                String direccionAdoptante =JOptionPane.showInputDialog("Ingrese direccion adoptante");
                int edadAdoptante = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
                Adoptante adoptante = new Adoptante(nombreAdoptante, apellidoAdoptante, direccionAdoptante, edadAdoptante);
                Especie gato = new Gato();

                JOptionPane.showMessageDialog(null, "Datos mascota");
                String nombreMascota =JOptionPane.showInputDialog("Ingrese nombre mascota");
                float pesoMascota = Float.parseFloat((JOptionPane.showInputDialog("Ingrese peso")));
                Date fechaNacimiento = new Date(2020, 1, 1); //
                Mascota mascota1 = new Mascota(nombreMascota, fechaNacimiento, pesoMascota, gato);
                Adopcion adopcion1 = new Adopcion(adoptante, mascota1, empleado);
                adopcion1.generarTicket();
            }
}