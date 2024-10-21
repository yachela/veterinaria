package org.example;

public class Adopcion {

    private Adoptante adoptante;
    private Mascota mascota;
    private Empleado empleado;
    private Ticket ticket;

    public Adopcion(Adoptante adoptante, Mascota mascota, Empleado empleado) {
        this.adoptante = adoptante;
        this.mascota = mascota;
        this.empleado = empleado;
        this.ticket = new Ticket();
    }

    public void generarTicket() {
       ticket.imprimir(this.empleado, this.adoptante, this.mascota);
    }

}
