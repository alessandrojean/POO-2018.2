package objetos;

public class Notebook extends Eletronico {
	private int numUSBs;

	public Notebook(String serial, int numUSBs) {
		super(serial);
		this.numUSBs = numUSBs;
	}
	
	@Override
	public String toString() {
		return "Notebook-" + getSerial() + "-" + numUSBs;
	}

}