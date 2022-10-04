import java.util.HashMap;

import circuitos.Circuito;
import utils.NumberGenerator;

public class ListaDeParticipantes {
    private HashMap<Integer, Participante> listaDeParticipantes = new HashMap<Integer, Participante>();

    public ListaDeParticipantes() {}

    public void addParticipante(Participante participante) {
        listaDeParticipantes.put(NumberGenerator.getInstance().getNext(), participante);
    }

    public Participante getParticipante(int id) {
        return listaDeParticipantes.get(id);
    }

    public void removeParticipante(int id) {
        listaDeParticipantes.remove(id);
    }

    public void updateParticipante(int id, Participante participante) {
        listaDeParticipantes.replace(id, participante);
    }

    public HashMap<Integer, Participante> getListaDeParticipantes() {
        return listaDeParticipantes;
    }

    public void imprimirListaDeParticipantes() {
        for (int id : listaDeParticipantes.keySet()) {
            System.out.println("ID: " + id + " - " + listaDeParticipantes.get(id).getNome() + " " + listaDeParticipantes.get(id).getSobrenome());
        }
    }

    public void cadastrarParticipantesFakes() {
        Participante p1 = new Participante("João", "Silva", "123456789", 20, "11999999999", "11999999999", "A+", Circuito.getCircuito("1"));
        Participante p2 = new Participante("Maria", "Silva", "123456789", 20, "11999999999", "11999999999", "A+", Circuito.getCircuito("2"));
        Participante p3 = new Participante("José", "Silva", "123456789", 20, "11999999999", "11999999999", "A+", Circuito.getCircuito("3"));
        Participante p4 = new Participante("Ana", "Silva", "123456789", 20, "11999999999", "11999999999", "A+", Circuito.getCircuito("1"));
        Participante p5 = new Participante("Pedro", "Silva", "123456789", 20, "11999999999", "11999999999", "A+", Circuito.getCircuito("2"));

        addParticipante(p1);
        addParticipante(p2);
        addParticipante(p3);
        addParticipante(p4);
        addParticipante(p5);
    }
}
