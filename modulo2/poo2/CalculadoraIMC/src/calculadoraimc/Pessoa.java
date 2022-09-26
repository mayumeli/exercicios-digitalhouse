package calculadoraimc;

public class Pessoa {
    private String nome;
    private int idade;
    private String id;
    private double peso;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Pessoa(String nome, int idade, String id, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public Pessoa() {}

    public Pessoa(String nome, int idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    private void ehPossivelCalcularIMC() {
        if (this.peso == 0 || this.altura == 0) {
            throw new RuntimeException("Peso ou altura não informados");
        }
    }

    public int calcularIMC() {
        ehPossivelCalcularIMC();
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    private String retornarIMC() {
        int imc = calcularIMC();
        if (imc == -1) {
            return "Abaixo do peso";
        } else if (imc == 0) {
            return "Peso saudável";
        } else {
            return "Sobrepeso";
        }
    }

    public void imprimirIMC() {
        System.out.println(retornarIMC());
    }

    public String ehMaiorIdade() {
        if (idade >= 18) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    @Override
    public String toString() {
        String resultado = "Nome: " + nome + " " + "Idade: " + idade + " " + "Id: " + id + " " + "Peso: " + peso + " " + "Altura: " + altura;
        return resultado;
    }

    public void imprimirRelatorioCompleto() {
        String IMC = retornarIMC();
        String resultado = toString() + " " + "IMC: " + retornarIMC() + " " + "Maior de idade: " + ehMaiorIdade();
        System.out.println(resultado);
    }
}
