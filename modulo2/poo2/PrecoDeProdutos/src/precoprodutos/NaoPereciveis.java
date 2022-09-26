package precoprodutos;

public class NaoPereciveis extends Produto {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public NaoPereciveis(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    public String toString() {
        return "Tipo: " + this.tipo;
    }
}
