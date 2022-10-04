import circuitos.Circuito;

public class Participante {
    private String nome;
    private String sobrenome;
    private String rg;
    private int idade;
    private String celular;
    private String numeroEmergencia;
    private String grupoSanguineo;
    private Circuito tipoDeCircuito;

    public Participante(String nome, String sobrenome, String rg, int idade, String celular, String numeroEmergencia, String grupoSanguineo, Circuito tipoDeCircuito) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.idade = idade;
        this.celular = celular;
        this.numeroEmergencia = numeroEmergencia;
        this.grupoSanguineo = grupoSanguineo;
        this.tipoDeCircuito = tipoDeCircuito;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
      return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNumeroEmergencia() {
        return this.numeroEmergencia;
    }

    public void setNumeroEmergencia(String numeroEmergencia) {
        this.numeroEmergencia = numeroEmergencia;
    }

    public String getGrupoSanguineo() {
      return this.grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public Circuito getTipoDeCircuito() {
        return this.tipoDeCircuito;
    }

    public void setTipoDeCircuito(Circuito tipoDeCircuito) {
        this.tipoDeCircuito = tipoDeCircuito;
    }

    @Override
        public String toString() {
            return "{" +
                " nome='" + getNome() + "'" +
                ", sobrenome='" + getSobrenome() + "'" +
                ", rg='" + getRg() + "'" +
                ", idade='" + getIdade() + "'" +
                ", celular='" + getCelular() + "'" +
                ", numeroEmergencia='" + getNumeroEmergencia() + "'" +
                ", grupoSanguineo='" + getGrupoSanguineo() + "'" +
                "}";
    }
}