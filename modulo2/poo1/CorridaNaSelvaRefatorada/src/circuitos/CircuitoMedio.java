package circuitos;

public class CircuitoMedio implements Circuito {
    public int calcular(int idade) {
        int valor = 0;
        if (idade < 18) {
            valor = 2000;
        } else {
            valor = 2300;
        }
        return valor;
    }

    public String getNome() {
        return "Médio";
    }
}
