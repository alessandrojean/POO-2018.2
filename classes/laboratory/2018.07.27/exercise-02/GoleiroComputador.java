public class GoleiroComputador extends Jogador implements GoleiroStrategy {

  public GoleiroComputador() {
    super("Computador");
  }

  @Override
  public int defender() {
    return (int) (Math.random() * 3 + 1);
  }

}