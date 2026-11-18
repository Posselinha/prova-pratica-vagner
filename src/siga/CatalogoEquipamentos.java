package siga;

import java.util.ArrayList;
import java.util.List;

public class CatalogoEquipamentos {

    private final Inventario inventario;

    public CatalogoEquipamentos(Inventario inventario) {
        this.inventario = inventario
    }

    public List<Equipamento> listarDisponiveis() {
        List<Equipamento> disponiveis = new ArrayList<>();
        for (Equipamento item : inventario.listarTodos()) {
            if (item.isDisponivel()) {
                disponiveis.add(item);
            }
        }
        return disponiveis;
    }
}
