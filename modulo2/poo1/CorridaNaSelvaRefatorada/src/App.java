import circuitos.Circuito;
import exceptions.ParticipanteNaoExisteException;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Participante p = new Participante("João", "Silva", "123456789", 20, "11999999999", "11999999999", "A+", Circuito.getCircuito("1"));
            ListaDeParticipantes lista = new ListaDeParticipantes();
            lista.addParticipante(p);
            // lista.imprimirListaDeParticipantes();
            System.out.println(lista.getParticipante(2));
        } catch (ParticipanteNaoExisteException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
