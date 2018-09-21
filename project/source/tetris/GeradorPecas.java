package tetris;

import java.util.Random;

import tetris.peca.*;

public abstract class GeradorPecas {

  private static Random random = new Random();
  private static final String PECAS = "IJLOSTZ";
  
  /**
   * Gera uma peça aleatória dentre as 
   * sete peças bases disponíveis.
   * 
   * @return peça gerada aleatoriamente
   */
  public static Peca gerarPecaAleatoria() {
    // Gera um número randômico dentro do tamanho da string.
    int indicePeca = random.nextInt(PECAS.length());
    char tipoPeca = PECAS.charAt(indicePeca);

    switch (tipoPeca) {
      case 'I':
        return new PecaI();
      case 'J':
        return new PecaJ();
      case 'L':
        return new PecaL();
      case 'O':
        return new PecaO();
      case 'S':
        return new PecaS();
      case 'T':
        return new PecaT();
      case 'Z':
        return new PecaZ();
    }

    return null;
  }

}