package siga;

public class ReservaEmUso implements EstadoReserva {

    @Override
    public String getNome() {
        return "EM_USO";
    }

    @Override
    public void retirar(Reserva reserva) {
        throw new IllegalStateException("Nao e possivel retirar em " + getNome() + ".");
    }

    @Override
    public void devolver(Reserva reserva) {
        reserva.setEstado(new ReservaEncerrada());
    }

    @Override
    public void cancelar(Reserva reserva) {
        throw new IllegalStateException("Nao e possivel cancelar em " + getNome() + ".");
    }
}