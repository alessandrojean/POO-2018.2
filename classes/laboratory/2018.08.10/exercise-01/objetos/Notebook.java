package objetos;

public class Notebook extends Eletronico {
  private int numeroUSBs;

  public Notebook(String serial, int numeroUSBs) {
    super(serial);
    this.numeroUSBs = numeroUSBs;
  }

  public int getNumeroUSBs() {
    return numeroUSBs;
  }

  @Override
  public String toString() {
    return "Notebook-" + getSerial() + "-" + numeroUSBs;
  }
}