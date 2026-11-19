package siga;

public interface EstadoReserva {
    String getNome();   
    void retirar(Reserva reserva);
    void devolver(Reserva reserva);
    void cancelar(Reserva reserva);
}