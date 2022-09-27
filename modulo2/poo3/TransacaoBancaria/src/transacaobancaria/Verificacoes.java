package transacaobancaria;

public class Verificacoes {

    // Aqui foram feitas verificações aleatórias para testar o funcionamento do programa

    public static boolean verificarTransacao(double valor) {
        if (valor <= 500) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean verificarSaque(double valor) {
        if (valor > 500) {
            return false;
        } else {
            return true;
        }
    }

    public static String verificarTipoCliente(String nome) {
        String tipo = "";
        if (nome.length() <= 5) {
            tipo = "Basico";
        } else if (nome.length() <= 10) {
            tipo = "Colaborador";
        } else {
            tipo = "Executivo";
        }
        return tipo;
    }
}
