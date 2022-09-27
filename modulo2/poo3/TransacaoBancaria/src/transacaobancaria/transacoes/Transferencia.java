package transacaobancaria.transacoes;

import transacaobancaria.Verificacoes;

import java.util.Scanner;

public class Transferencia implements Transacao {

    public void transacaoOk() {
        System.out.println("Transferencia realizada com sucesso!");
    }

    public void transacaoNaoOk() {
        System.out.println("Transferencia nao realizada! Saldo insuficiente!");
    }

    public void realizarTransacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da transferência: ");
        String valor = scanner.nextLine();
        System.out.println("Digite a conta do destino: ");
        int conta = scanner.nextInt();
        System.out.println("Realizando transferência...");
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
