package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        // Criando lista de pedidos
//        List<Pedido> pedidos = new ArrayList<>();
//
//        // Adicionando alguns pedidos de exemplo
//        pedidos.add(new Pedido(1, false));
//        pedidos.add(new Pedido(2, false));
//        pedidos.add(new Pedido(3, true));  // Esse será cancelado
//        pedidos.add(new Pedido(4, false));
//
//        // Exemplo 1: Interrompendo Processamento de Pedidos
//        for (int i = 0; i < pedidos.size(); i++) {
//            if (pedidos.get(i).isCancelado()) {
//                break; // Sai do loop se um pedido for cancelado
//            }
//            System.out.println("Processando pedido: " + pedidos.get(i).getId());
//        }
//    }
//}
//
//// Classe Pedido
//class Pedido {
//    private int id;
//    private boolean cancelado;
//
//    public Pedido(int id, boolean cancelado) {
//        this.id = id;
//        this.cancelado = cancelado;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public boolean isCancelado() {
//        return cancelado;


                Scanner scanner = new Scanner(System.in);
                double soma = 0;

                System.out.println("Informe os valores das vendas do dia (máximo 10). Digite 0 para encerrar:");

                for (int i = 0; i < 10; i++) {
                    double venda = scanner.nextDouble();
                    if (venda == 0) {
                        break; // Encerra o loop se o valor da venda for 0
                    }
                    soma += venda;
                }

                System.out.println("Faturamento total: R$ " + soma);
           

    }
}
