package siga;

public class ReservaSolicitada implements EstadoReserva {

    @Override
    public String getNome() {
        return "SOLICITADA";
    }

    @Override
    public void retirar(Reserva reserva) {
        reserva.setEstado(new ReservaEmUso());
    }

    @Override
    public void devolver(Reserva reserva) {
        throw new IllegalStateException("Nao e possivel devolver em " + getNome() + ".");
    }

    @Override
    public void cancelar(Reserva reserva) {
        reserva.setEstado(new ReservaEncerrada());
    }
}