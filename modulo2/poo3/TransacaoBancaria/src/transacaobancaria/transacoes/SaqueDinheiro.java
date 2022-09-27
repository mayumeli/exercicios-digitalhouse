package transacaobancaria.transacoes;

import transacaobancaria.Verificacoes;

import java.util.Scanner;

public class SaqueDinheiro implements Transacao {

    public void transacaoOk() {
        System.out.println("Saque realizado com sucesso!");
    }

    public void transacaoNaoOk() {
        System.out.println("Saque nao realizado! saldo insuficiente!");
    }

    public void realizarTransacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantia a ser sacada: ");
        String quantia = scanner.nextLine();
        System.out.println("Realizando saque...");
        double valor = Math.random() * 1000;
        boolean sucesso = Verificacoes.verificarTransacao(valor);
        if (sucesso == true) {
            transacaoOk();
        } else {
            transacaoNaoOk();
        }
        scanner.close();
    }
}
