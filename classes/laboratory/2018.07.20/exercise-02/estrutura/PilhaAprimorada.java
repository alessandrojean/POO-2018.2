package estrutura;

public class PilhaAprimorada extends PilhaSimples {
  public PilhaAprimorada(int tamanhoMax) {
    super(tamanhoMax);
  }

  @Override
  public void empilha(Object novoItem) {
    if (getTopo() + 1 >= getTamanhoMax())
      throw new PilhaCheiaException(getTamanhoMax(), novoItem);

    super.empilha(novoItem);
  }

  @Override
  public Object desempilha() {
    if (getTopo() == -1)
      throw new PilhaVaziaException();

    return super.desempilha();
  }
}