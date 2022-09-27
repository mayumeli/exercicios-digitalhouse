package transacaobancaria.clientes;

import transacaobancaria.ProcessarOpcao;

import java.util.Scanner;

public class Executivo extends Cliente {
    private String tipo = "Executivo";

    public Executivo(String nome, String cpf) {
        super(nome, cpf);
    }

    public void abrirOpcoes() {
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Opções do cliente executivo:");
            System.out.println("2 - Depósito");
            System.out.println("5 - Transferência");
            System.out.print("Escolha uma opção: ");
            String possivelOpcao = scanner.nextLine();
            int possivelOpcaoInt = Integer.parseInt(possivelOpcao);
            if (possivelOpcaoInt == 2 || possivelOpcaoInt == 5) {
                opcao = possivelOpcaoInt;
            } else {
                System.out.println("Opção inválida! Digite novamente: ");
            }
        } while (opcao == 0);
        ProcessarOpcao.ProcessarOpcao(opcao);
        scanner.close();
    }
}
