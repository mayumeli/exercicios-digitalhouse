import circuitos.Circuito;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Participante p = new Participante("João", "Silva", "123456789", 20, "11999999999", "11999999999", "A+", Circuito.getCircuito("1"));
            ListaDeParticipantes lista = new ListaDeParticipantes();
            lista.addParticipante(p);
            lista.imprimirListaDeParticipantes();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
