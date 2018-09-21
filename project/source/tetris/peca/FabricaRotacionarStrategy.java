package tetris.peca;

public class FabricaRotacionarStrategy {
  /**
   * Cria a estratégia de rotação correta com base
   * no {@code tipo} da peça passado.
   * 
   * @param tipo tipo de peça
   * @return estratégia de rotação adequada
   */
  public static RotacionarStrategy criarEstrategia(char tipo) {
    if (tipo == 'O')
      return new RotacionarQuadradoStrategy();
    else if (tipo == 'S' || tipo == 'Z' || tipo == 'I')
      return new RotacionarDoisStrategy();
    else
      return new RotacionarNormalStrategy();
  }
  
}