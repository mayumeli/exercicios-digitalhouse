package transacaobancaria.transacoes;

import transacaobancaria.Verificacoes;

import java.util.Scanner;

public class Pagamento implements Transacao {

    public void transacaoOk() {
        System.out.println("Pagamento realizado com sucesso!");
    }

    public void transacaoNaoOk() {
        System.out.println("Pagamento nao realizado! seu saldo é insuficiente !");
    }

    public void realizarTransacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código de barras: ");
        String codigo = scanner.nextLine();
        System.out.println("Realizando pagamento...");
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
