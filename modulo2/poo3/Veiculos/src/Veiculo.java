public class Veiculo {
  private String modelo;
  private String marca;
  private double preco;


  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getMarca() {
    return this.marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public double getPreco() {
    return this.preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }


  public Veiculo(String modelo, String marca, double preco) {
    this.modelo = modelo;
    this.marca = marca;
    this.preco = preco;
  }
}
