package gui;

import java.awt.Color;

public class ColorUtil {
  /**
   * Clona a cor {@code c}, com o {@code alpha} especificado.
   * 
   * @param c cor base
   * @param alpha transparência
   * @return cor base com a transparência
   */
  public static Color clonarComAlpha(Color c, int alpha) {
    return new Color(c.getRed(), c.getGreen(), c.getBlue(), alpha);
  }

  /**
   * Calcula a luminância da cor {@code c}.
   * 
   * @param c cor
   * @return luminância da cor
   */
  public static double calcularLuminancia(Color c) {
    return 0.2126 * (double) c.getRed() + 0.7152 * (double) c.getGreen()
      + 0.0722 * (double) c.getBlue();
  }

  /**
   * Retorna se a cor é escura ou não.
   * 
   * @param c cor
   * @return {@code true} se a cor é escura
   */
  public static boolean ehEscura(Color c) {
    return calcularLuminancia(c) < 128;
  }
}