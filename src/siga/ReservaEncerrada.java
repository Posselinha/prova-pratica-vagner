package siga;

public class ReservaEncerrada implements EstadoReserva {

    @Override
    public String getNome() {
        return "ENCERRADA";
    }

    @Override
    public void retirar(Reserva reserva) {
        throw new IllegalStateException("Nao e possivel retirar em " + getNome() + ".");
    }

    @Override
    public void devolver(Reserva reserva) {
        throw new IllegalStateException("Nao e possivel devolver em " + getNome() + ".");
    }

    @Override
    public void cancelar(Reserva reserva) {
        throw new IllegalStateException("Nao e possivel cancelar em " + getNome() + ".");
    }
}