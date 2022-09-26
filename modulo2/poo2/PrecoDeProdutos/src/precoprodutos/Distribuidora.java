package precoprodutos;

public class Distribuidora {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[3];
        produtos[0] = new Pereciveis("Arroz", 10.0, 1);
        produtos[1] = new NaoPereciveis("Feijao", 5.0, "Alimento");
        produtos[2] = new Pereciveis("Leite", 3.0, 2);

        for (Produto produto : produtos) {
            System.out.println(produto.calcular(5));
        }
    }
}
