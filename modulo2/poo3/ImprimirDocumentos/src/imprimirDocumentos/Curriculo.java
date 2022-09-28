package imprimirDocumentos;

import java.util.List;

public class Curriculo extends Documento {
    private String nome;
    private String sobrenome;
    private int idade;
    private String profissao;

    private List<String> habilidades;

    public Curriculo(String nome, String sobrenome, int idade, String profissao, List<String> habilidades) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.profissao = profissao;
        this.habilidades = habilidades;
    }

    public String getHabilidades() {
        return habilidades.toString();
    }

    @Override
    public String toString() {
        return "Curriculo{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", profissao='" + profissao + '\'' +
                ", habilidades=" + getHabilidades() +
                '}';
    }

    public void imprimir() {
        Imprimir.imprimirDocumento(this.toString());
    }

}
