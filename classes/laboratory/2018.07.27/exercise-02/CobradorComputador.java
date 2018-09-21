public class CobradorComputador extends Jogador implements CobradorStrategy {

  public CobradorComputador() {
    super("Computador");
  }

  @Override
  public int chutar() {
    return (int) (Math.random() * 3 + 1);
  }
  
}