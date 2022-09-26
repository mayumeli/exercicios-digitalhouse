package calculadoraimc;

public class Main {

        public static void main(String[] args) {
            Pessoa p = new Pessoa("Joao", 20, "123456789", 80, 1.80);
            System.out.println(p);
            p.imprimirIMC();
            p.imprimirRelatorioCompleto();
        }
}
