package precoprodutos;

public class Pereciveis extends Produto {
    private int diasParaVencer;

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public String toString() {
        return  super.toString() + " Dias para vencer: " + this.diasParaVencer;
    }

    private int calcularDesconto() {
        if (this.diasParaVencer == 1) {
            return 4;
        } else if (this.diasParaVencer == 2) {
            return 3;
        } else if (this.diasParaVencer == 3) {
            return 2;
        } else {
            return 1;
        }
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {

        return (super.preco * quantidadeDeProdutos) / calcularDesconto();
    }
}

