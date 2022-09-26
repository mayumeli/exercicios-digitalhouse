package Relogio;

public class Main {
    public static void main(String[] args) {
        try {
            Relogio relogio = new Relogio(25, 20, 30);
            System.out.println(relogio.getRelogioTime());
        } catch ( IllegalArgumentException e ) {
            System.out.println(e.getMessage());
        } catch ( Exception e ) {
            System.out.println(e.getMessage());
        }
        System.out.println(Relogio.getHoraAtual());
    }
}

