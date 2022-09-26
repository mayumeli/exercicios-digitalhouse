package praticaexcecoes;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(PraticaExcecoes.divisao(10, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fim do programa");
        }
    }
}