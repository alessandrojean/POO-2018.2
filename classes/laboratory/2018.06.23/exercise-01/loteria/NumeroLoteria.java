package loteria;

public class NumeroLoteria {
  private int[] numeros;

  public NumeroLoteria() {
    numeros = new int[3];
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = NumeroAleatorio.getAleatorio();
    }
  }

  public NumeroLoteria(int[] numeros) throws Exception {
    if (numeros.length != 3) {
      throw new Exception("Comprimento de números diferente de 3.");
    }
    this.numeros = numeros;
  }

  public String getNumeros() {
    String ret = "";
    for (int i = 0; i < numeros.length; i++) {
      ret += numeros[i] + (i <= numeros.length - 1 ? ", " : "");
    }
    return ret;
  }

  public boolean ganhou(NumeroLoteria nLoteria) {
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] != nLoteria.numeros[i])
        return false;
    }
    return true;
  }
}