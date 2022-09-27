package transacaobancaria.transacoes;

public interface Transacao {
    void transacaoOk();
    void transacaoNaoOk();

    void realizarTransacao();
}
