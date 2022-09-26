package praticaexcecoes;

public class PraticaExcecoes {

    public static double divisao(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Nao pode ser dividido por zero.");
        }
        return a / b;
    }
}
