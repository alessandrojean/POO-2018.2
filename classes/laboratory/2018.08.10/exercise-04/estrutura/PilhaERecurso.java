package estrutura;

public class PilhaERecurso extends PilhaE implements AutoCloseable {
  public PilhaERecurso(int tamanhoMax) {
    super(tamanhoMax);
  }

  @Override
  public void close() throws Exception {
    int tamanho = getTopo() + 1;
    while (getTopo() != -1) {
      desempilha();
    }
    System.out.println("Pilha foi esvaziada! Tinha " + tamanho + " itens.");
  }
}