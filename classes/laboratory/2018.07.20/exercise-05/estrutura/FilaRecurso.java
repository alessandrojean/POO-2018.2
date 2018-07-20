package estrutura;

public class FilaRecurso extends FilaAprimorada implements AutoCloseable {
  public FilaRecurso(int tamanhoMax) {
    super(tamanhoMax);
  }

  @Override
  public void close() {
    while (getInicio() != getFim())
      desenfileira();
  }
}