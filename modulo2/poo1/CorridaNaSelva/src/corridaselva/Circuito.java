package corridaselva;

import java.util.HashMap;

public interface Circuito {
    public int calcular(int idade);

    public static Circuito getCircuito(String tipo) {
        HashMap<String, Circuito> circuitos = new HashMap<>();
        circuitos.put("1", new CircuitoPequeno());
        circuitos.put("2", new CircuitoMedio());
        circuitos.put("3", new CircuitoAvancado());
        return circuitos.get(tipo);
    }

    public String getNome();
}
