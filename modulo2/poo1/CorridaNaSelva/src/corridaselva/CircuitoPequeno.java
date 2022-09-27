package corridaselva;

public class CircuitoPequeno implements Circuito {
    public int calcular(int idade) {
        int valor = 0;
        if (idade < 18) {
            valor = 1300;
        } else {
            valor = 1500;
        }
        return valor;
    }

    public String getNome() {
        return "Pequeno";
    }
}
