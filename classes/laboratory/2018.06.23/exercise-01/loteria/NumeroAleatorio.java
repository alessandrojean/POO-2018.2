package loteria;

import java.lang.Math;

public class NumeroAleatorio {
  private static int seed = 2144;

  public static int getAleatorio() {
    // return Math.random() * 9999 + 1;

    int seedSquared = seed * seed;
    String seedWithPad = String.format("%08d", seedSquared);

    seed = Integer.parseInt(seedWithPad.substring(2, 6));
    return seed;
  }
}