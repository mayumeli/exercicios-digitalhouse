package circuitos;

public class CircuitoAvancado implements Circuito {
    public int calcular(int idade) {
        int valor = 0;
        if (idade < 18) {
            valor = 0;
        } else {
            valor = 3500;
        }
        return valor;
    }

    public String getNome() {
        return "Avançado";
    }
}
