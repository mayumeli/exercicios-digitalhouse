package transacaobancaria;

import transacaobancaria.clientes.Basico;
import transacaobancaria.clientes.Cliente;
import transacaobancaria.clientes.Colaborador;
import transacaobancaria.clientes.Executivo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();
        String tipo = Verificacoes.verificarTipoCliente(nome);
        System.out.println("Cliente logado com sucesso!" + "\n");
        Cliente cliente = null;
        switch (tipo) {
            case "Executivo":
                cliente = new Executivo(nome, cpf);
                break;
            case "Colaborador":
                cliente = new Colaborador(nome, cpf);
                break;
            case "Basico":
                cliente = new Basico(nome, cpf);
                break;
        }
        cliente.abrirOpcoes();
        scanner.close();
    }
}
