package corridaselva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeParticipantes {
    private List<Participante> listaParticipantes = new ArrayList<Participante>();

    public ListaDeParticipantes(List<Participante> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public ListaDeParticipantes() {}

    private void cadastrarParticipante(Scanner s) {
        int controle = 1;
        do {
            System.out.println("Digite o nome do participante: ");
            String nome = s.nextLine();
            System.out.println("Digite o sobrenome do participante: ");
            String sobrenome = s.nextLine();
            System.out.println("Digite o RG do participante: ");
            String RG = s.nextLine();
            System.out.println("Digite a idade do participante: ");
            String i = s.nextLine();
            int idade = Integer.parseInt(i);
            System.out.println("Digite o celular do participante: ");
            String celular = s.nextLine();
            System.out.println("Digite o tipo sanguineo do participante: ");
            String tipoSanguineo = s.nextLine();
            String tipo = "";
            int tipoCircuitoLoopControl = 0;
            do {
                System.out.println("Escolha o tipo de circuito do participante: ");
                System.out.println("1 - Pequeno");
                System.out.println("2 - Medio");
                System.out.println("3 - Avançado");
                tipo = s.nextLine();
                if (tipo.equals("1") || tipo.equals("2") || tipo.equals("3")) {
                    tipoCircuitoLoopControl = 1;
                    if (tipo.equals("3") && idade < 18) {
                        System.out.println("O participante não pode participar do circuito avançado");
                        tipoCircuitoLoopControl = 0;
                    }
                } else {
                    System.out.println("Opção inválida!");
                }
            } while (tipoCircuitoLoopControl == 0);
            Circuito circuitoCorreto = Circuito.getCircuito(tipo);
            // pick last participante number
            int numero = 1;
            if (listaParticipantes.size() > 0) {
                numero = listaParticipantes.get(listaParticipantes.size() - 1).getNumero() + 1;
            }
            Participante p = new Participante(nome, sobrenome, RG, idade, celular, tipoSanguineo, circuitoCorreto, numero);
            listaParticipantes.add(p);
            System.out.println("------------------------");
            System.out.println("O participante foi cadastrado com sucesso!");
            System.out.println("Dados do participante:");
            System.out.println(p);
            System.out.println("------------------------");
            System.out.println("Deseja cadastrar mais um participante? (1 - sim, 0 - nao)");
            String novoControle = s.nextLine();
            controle = Integer.parseInt(novoControle);
        } while (controle == 1);
        System.out.println("Voltando ao menu principal..");
    }

    private void removerParticipante(Scanner s) {
        System.out.println("Digite o número do participante que deseja remover: ");
        String numero = s.nextLine();
        int numeroInt = Integer.parseInt(numero);
        for (int i = 0; i < listaParticipantes.size(); i++) {
            if (i == listaParticipantes.size() - 1 && listaParticipantes.get(i).getNumero() != numeroInt) {
                System.out.println("Participante nao encontrado!");
            }
            if (listaParticipantes.get(i).getNumero() == numeroInt) {
                listaParticipantes.remove(i);
                System.out.println("Participante removido com sucesso!");
            }
        }
        System.out.println("Voltando ao menu principal..");
    }

    private void listarParticipantes() {
        for (int i = 0; i < listaParticipantes.size(); i++) {
                System.out.println("------------------------");
                System.out.println(listaParticipantes.get(i));
            if (i == listaParticipantes.size() - 1) {
                System.out.println("------------------------");
            }
        }
    }

    private void listarParticipantesPorTipoDeCircuito() {
        Scanner s = new Scanner(System.in);
        String tipo = "";
        int tipoCircuitoLoopControl = 0;
        do {
            System.out.println("Escolha um tipo de circuito: ");
            System.out.println("1 - Pequeno");
            System.out.println("2 - Medio");
            System.out.println("3 - Avançado");
            tipo = s.nextLine();
            if (!tipo.equals("1") && !tipo.equals("2") && !tipo.equals("3")) {
                System.out.println("Opção inválida!");
            } else {
                tipoCircuitoLoopControl = 1;
            }
        } while (tipoCircuitoLoopControl == 0);
        Circuito circuitoCorreto = Circuito.getCircuito(tipo);
        for (int i = 0; i < listaParticipantes.size(); i++) {
            if (listaParticipantes.get(i).getTipoDeCircuito().getNome().equals(circuitoCorreto.getNome())) {
                System.out.println("------------------------");
                System.out.println(listaParticipantes.get(i));
            }
            if (i == listaParticipantes.size() - 1) {
                System.out.println("------------------------");
            }
        }
    }

    private void cadastrarParticipantesFakes() {
        int numero = 1;
        if (listaParticipantes.size() > 0) {
            numero = listaParticipantes.get(listaParticipantes.size() - 1).getNumero() + 1;
        }
        Participante p1 = new Participante("Joao", "Silva", "123456789", 20, "999999999", "A+", new CircuitoPequeno(), numero);
        Participante p2 = new Participante("Maria", "Silva", "987654321", 23, "888888888", "B+", new CircuitoMedio(), numero + 1);
        Participante p3 = new Participante("Jose", "Silva", "123456789", 18, "777777777", "AB+", new CircuitoAvancado(), numero + 2);
        Participante p4 = new Participante("Joana", "Silva", "987654321", 16, "666666666", "O+", new CircuitoPequeno(), numero + 3);
        Participante p5 = new Participante("Carlos", "Silva", "123456789", 14, "555555555", "A+", new CircuitoMedio(), numero + 4);
        Participante p6 = new Participante("Tatiana", "Silva", "987654321", 27, "444444444", "B+", new CircuitoAvancado(), numero + 5);
        Participante p7 = new Participante("Jessica", "Silva", "123456789", 40, "333333333", "AB+", new CircuitoPequeno(), numero + 6);
        Participante p8 = new Participante("Matheus", "Silva", "987654321", 24, "222222222", "O+", new CircuitoMedio(), numero + 7);
        Participante p9 = new Participante("Fernando", "Silva", "123456789", 35, "111111111", "A+", new CircuitoAvancado(), numero + 8);
        Participante p10 = new Participante("Larissa", "Silva", "987654321", 20, "000000000", "B+", new CircuitoPequeno(), numero + 9);
        listaParticipantes.add(p1);
        listaParticipantes.add(p2);
        listaParticipantes.add(p3);
        listaParticipantes.add(p4);
        listaParticipantes.add(p5);
        listaParticipantes.add(p6);
        listaParticipantes.add(p7);
        listaParticipantes.add(p8);
        listaParticipantes.add(p9);
        listaParticipantes.add(p10);
        System.out.println("Pessoas fakes cadastradas com sucesso !");
        System.out.println("Voltando ao menu principal..");
    }

    public void menu() {
        int control = 0;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Digite o numero da opcao desejada: ");
            System.out.println("1 - Cadastrar participante");
            System.out.println("2 - Remover participante");
            System.out.println("3 - Listar participantes");
            System.out.println("4 - Listar participantes por tipo de circuito");
            System.out.println("5 - Cadastrar participantes fakes");
            System.out.println("6 - Sair");
            String o = s.nextLine();
            int opcao = Integer.parseInt(o);
            switch (opcao) {
                case 1:
                    cadastrarParticipante(s);
                    break;
                case 2:
                    removerParticipante(s);
                    break;
                case 3:
                    listarParticipantes();
                    break;
                case 4:
                    listarParticipantesPorTipoDeCircuito();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    control = 1;
                    break;
                case 5:
                    System.out.println("Cadastrando pessoas fakes...");
                    cadastrarParticipantesFakes();
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        } while (control == 0);
        s.close();
    }
}
