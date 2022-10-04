import java.util.List;

public class Garagem {
  private int id;
  private List<Veiculo> veiculos;
  
  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public List<Veiculo> getVeiculos() {
    return this.veiculos;
  }

  public void setVeiculos(List<Veiculo> veiculos) {
    this.veiculos = veiculos;
  }

  public Garagem(int id, List<Veiculo> veiculos) {
    this.id = id;
    this.veiculos = veiculos;
  }

}
