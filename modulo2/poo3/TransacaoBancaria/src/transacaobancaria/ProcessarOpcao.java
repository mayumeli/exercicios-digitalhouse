package transacaobancaria;

import transacaobancaria.transacoes.*;

public class ProcessarOpcao {
    public static void ProcessarOpcao(int opcao) {
        Transacao transacao = null;
        switch (opcao) {
            case 1:
                transacao = new Consulta();
                break;
            case 2:
                transacao = new Deposito();
                break;
            case 3:
                transacao = new Pagamento();
                break;
            case 4:
                transacao = new SaqueDinheiro();
                break;
            case 5:
                transacao = new Transferencia();
                break;
        }
        transacao.realizarTransacao();
    }
}
