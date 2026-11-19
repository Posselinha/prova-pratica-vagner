package siga;

public class Reserva {

    private final Usuario solicitante;
    private final Equipamento item;
    private EstadoReserva estado;

    public Reserva(Usuario solicitante, Equipamento item) {
        this.solicitante = solicitante;
        this.item = item;
        this.estado = new ReservaSolicitada();
    }

    void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }

    public String getSituacao() {
        return estado.getNome();
    }

    public void retirar() {
        estado.retirar(this);
    }

    public void devolver() {
        estado.devolver(this);
    }

    public void cancelar() {
        estado.cancelar(this);
    }

    public Usuario getSolicitante() {
        return solicitante;
    }

    public Equipamento getEquipamento() {
        return item;
    }
}