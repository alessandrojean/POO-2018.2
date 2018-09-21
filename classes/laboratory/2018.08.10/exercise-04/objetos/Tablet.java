package objetos;

public class Tablet extends Eletronico {

	public Tablet(String serial) {
		super(serial);
	}
	
	@Override
	public String toString() {
		return "Tablet-" + getSerial();
	}

}