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
            Participante p = new Participante(nome, sobrenome, RG, idade, celular, tipoSanguineo);
            listaParticipantes.add(p);
            System.out.println("Deseja cadastrar mais um participante? (1 - sim, 0 - nao)");
            String novoControle = s.nextLine();
            controle = Integer.parseInt(novoControle);
        } while (controle == 1);
        System.out.println("Voltando ao menu principal..");
    }

    private void removerParticipante(Scanner s) {
        System.out.println("Digite o RG do participante que deseja remover: ");
        String rg = s.nextLine();
        for (int i = 0; i < listaParticipantes.size(); i++) {
            if (listaParticipantes.get(i).getRG().equals(rg)) {
                listaParticipantes.remove(i);
                System.out.println("Participante removido com sucesso!");
            }
            if (i == listaParticipantes.size() - 1 && !listaParticipantes.get(i).getRG().equals(rg)) {
                System.out.println("Participante nao encontrado!");
            }
        }
        System.out.println("Voltando ao menu principal..");
    }

    private void listarParticipantes() {
        for (int i = 0; i < listaParticipantes.size(); i++) {
            System.out.println("------------------------");
            System.out.println("Nome: " + listaParticipantes.get(i).getNome());
            System.out.println("Sobrenome: " + listaParticipantes.get(i).getSobrenome());
            System.out.println("RG: " + listaParticipantes.get(i).getRG());
            System.out.println("Idade: " + listaParticipantes.get(i).getIdade());
            System.out.println("Celular: " + listaParticipantes.get(i).getCelular());
            System.out.println("Tipo sanguineo: " + listaParticipantes.get(i).getTipoSanguineo());
            if (i == listaParticipantes.size() - 1) {
                System.out.println("------------------------");
            }
        }
    }

    private void cadastrarParticipantesFakes() {
        Participante p1 = new Participante("Joao", "Silva", "123456789", 20, "999999999", "A+");
        Participante p2 = new Participante("Maria", "Silva", "987654321", 23, "888888888", "B+");
        Participante p3 = new Participante("Jose", "Silva", "123456789", 18, "777777777", "AB+");
        Participante p4 = new Participante("Joana", "Silva", "987654321", 16, "666666666", "O+");
        Participante p5 = new Participante("Carlos", "Silva", "123456789", 27, "555555555", "A+");
        Participante p6 = new Participante("Tatiana", "Silva", "987654321", 14, "444444444", "B+");
        Participante p7 = new Participante("Jessica", "Silva", "123456789", 40, "333333333", "AB+");
        Participante p8 = new Participante("Matheus", "Silva", "987654321", 24, "222222222", "O+");
        Participante p9 = new Participante("Fernando", "Silva", "123456789", 35, "111111111", "A+");
        Participante p10 = new Participante("Larissa", "Silva", "987654321", 20, "000000000", "B+");
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
            System.out.println("4 - Sair");
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
                    System.out.println("Saindo...");
                    control = 1;
                    break;
                case 999:
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
