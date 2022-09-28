package corridaselva;

public class Participante {
    private String nome;
    private String sobrenome;
    private String RG;
    private int idade;
    private String celular;
    private String tipoSanguineo;
    private Circuito tipoDeCircuito;

    private int numero ;

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

    public Circuito getTipoDeCircuito() {
        return this.tipoDeCircuito;
    }

    public void setTipoDeCircuito(Circuito tipoDeCircuito) {
        this.tipoDeCircuito = tipoDeCircuito;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Participante(String nome, String sobrenome, String RG, int idade, String celular, String tipoSanguineo, Circuito tipoDeCircuito, int numero) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.idade = idade;
        this.celular = celular;
        this.tipoSanguineo = tipoSanguineo;
        this.tipoDeCircuito = tipoDeCircuito;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "nome: " + nome + "\n"
                + "sobrenome: " + sobrenome + "\n"
                + "RG: " + RG + "\n"
                + "idade: " + idade + "\n"
                + "celular: " + celular + "\n"
                + "tipoSanguineo: " + tipoSanguineo + "\n"
                + "tipoDeCircuito: " + tipoDeCircuito.getNome() + "\n"
                + "numero: " + numero + "\n"
                + "valor: " + tipoDeCircuito.calcular(idade) ;
    }

    public int calcularPreco() {
        int resultado = tipoDeCircuito.calcular(idade);
        return resultado;
    }
}
