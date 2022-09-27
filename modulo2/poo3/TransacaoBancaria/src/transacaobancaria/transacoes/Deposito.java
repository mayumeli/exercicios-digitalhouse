package transacaobancaria.transacoes;

import transacaobancaria.Verificacoes;

import java.util.Scanner;

public class Deposito implements Transacao {

    public void transacaoOk() {
        System.out.println("Deposito realizado com sucesso!");
    }

    public void transacaoNaoOk() {
        System.out.println("Deposito nao realizado! seu saldo é insuficiente!");
    }

    public void realizarTransacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do depósito: ");
        String valor = scanner.nextLine();
        System.out.println("Digite a conta do destino: ");
        String conta = scanner.nextLine();
        System.out.println("Realizando depósito...");
        double valorDouble = Double.parseDouble(valor);
        boolean sucesso = Verificacoes.verificarTransacao(valorDouble);
        if (sucesso == true) {
            transacaoOk();
        } else {
            transacaoNaoOk();
        }
        scanner.close();
    }
}
