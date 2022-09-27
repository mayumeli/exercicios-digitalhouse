package transacaobancaria.clientes;

import transacaobancaria.ProcessarOpcao;

import java.util.Scanner;

public class Colaborador extends Cliente {
    private String tipo = "Colaborador";

    public Colaborador(String nome, String cpf) {
        super(nome, cpf);
    }

    public void abrirOpcoes() {
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Opções do cliente colaborador:");
            System.out.println("1 - Consultar saldo");
            System.out.println("4 - Saque");
            System.out.print("Escolha uma opção: ");
            String possivelOpcao = scanner.nextLine();
            int possivelOpcaoInt = Integer.parseInt(possivelOpcao);
            if (possivelOpcaoInt == 1 || possivelOpcaoInt == 4) {
                opcao = possivelOpcaoInt;
            } else {
                System.out.println("Opção inválida! Digite novamente: ");
            }
        } while (opcao == 0);
        ProcessarOpcao.ProcessarOpcao(opcao);
        scanner.close();
    }
}
