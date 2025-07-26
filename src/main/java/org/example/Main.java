package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criando lista de pedidos
        List<Pedido> pedidos = new ArrayList<>();

        // Adicionando alguns pedidos de exemplo
        pedidos.add(new Pedido(1, false));
        pedidos.add(new Pedido(2, false));
        pedidos.add(new Pedido(3, true));  // Esse será cancelado
        pedidos.add(new Pedido(4, false));

        // Exemplo 1: Interrompendo Processamento de Pedidos
        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).isCancelado()) {
                break; // Sai do loop se um pedido for cancelado
            }
            System.out.println("Processando pedido: " + pedidos.get(i).getId());
        }
    }
}

// Classe Pedido
class Pedido {
    private int id;
    private boolean cancelado;

    public Pedido(int id, boolean cancelado) {
        this.id = id;
        this.cancelado = cancelado;
    }

    public int getId() {
        return id;
    }

    public boolean isCancelado() {
        return cancelado;
    }
}
