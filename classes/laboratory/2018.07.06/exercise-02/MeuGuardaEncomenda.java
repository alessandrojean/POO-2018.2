public class MeuGuardaEncomenda implements GuardaEncomenda {

  private Encomenda[] vEnc;
  private int indiceAtual = 0;

  public MeuGuardaEncomenda() {
    vEnc = new Encomenda[1000];
  }

  @Override
  public void adiciona(Encomenda e) {
    for (int i = 0; i < indiceAtual; i++) {
      if (vEnc[i].compareTo(e) == 0)
        return;
    }
    
    vEnc[indiceAtual++] = e;
    ordena();
  }

  @Override
  public int getSize() {
    return indiceAtual;
  }

  @Override
  public void ordena() {
    int i, j;
    Encomenda chave = null;
    for (i = 0; i < indiceAtual; i++) {
      chave = vEnc[i];
      j = i - 1;

      while (j >= 0 && vEnc[j].compareTo(chave) > 0) {
        vEnc[j + 1] = vEnc[j];
        j--;
      }
      vEnc[j + 1] = chave;
    }
  }

  @Override
  public String toString() {
    String ret = "";
    for (int i = 0; i < indiceAtual; i++) {
      ret = ret + vEnc[i] + ", ";
    }
    return ret;
  }
}