package tetris;

public class JogoAcabouException extends RuntimeException {
  public JogoAcabouException() {
    super("O jogo já acabou. Novos movimentos não são permitidos.");
  }  
}