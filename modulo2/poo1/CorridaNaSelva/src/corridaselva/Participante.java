package corridaselva;

public class Participante {
    private String nome;
    private String sobrenome;
    private String RG;
    private int idade;
    private String celular;
    private String tipoSanguineo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public Participante(String nome, String sobrenome, String RG, int idade, String celular, String tipoSanguineo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.idade = idade;
        this.celular = celular;
        this.tipoSanguineo = tipoSanguineo;
    }
}
