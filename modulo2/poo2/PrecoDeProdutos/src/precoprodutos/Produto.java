package precoprodutos;

public class Produto {
    protected String nome;
    protected double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " Preco: " + this.preco;
    }

    public double calcular(int quantidadeDeProdutos) {
        return this.preco * quantidadeDeProdutos;
    }
}
