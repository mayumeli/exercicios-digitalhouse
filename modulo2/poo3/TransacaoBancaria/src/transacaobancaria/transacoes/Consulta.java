package transacaobancaria.transacoes;

public class Consulta implements Transacao {

    public void transacaoOk() {
        System.out.println("Consulta realizada com sucesso!");
        // get random number between 0 and 999999999
        int random = (int) (Math.random() * 1000000000);
        System.out.println("Saldo: R$" + random);
    }

    public void transacaoNaoOk() {
        System.out.println("Obs! houve um problema em nosso sistema, tente mais tarde!");
    }

    public void realizarTransacao() {
        System.out.println("Realizando consulta...");
        if (Math.random() > 0.1) {
            transacaoOk();
        } else {
            transacaoNaoOk();
        }
    }
}

