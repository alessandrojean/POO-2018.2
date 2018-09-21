package objetos;

public abstract class Eletronico implements Cloneable {
  private String serial;

  public Eletronico(String serial) {
    setSerial(serial);
  }

  public void setSerial(String serial) {
    this.serial = serial;
  }

  public String getSerial() {
    return serial;
  }

  @Override
  public Eletronico clone() throws CloneNotSupportedException {
    return (Eletronico) super.clone();
  }

  @Override
  public String toString() {
    return getSerial();
  }
}