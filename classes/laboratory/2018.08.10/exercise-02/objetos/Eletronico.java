package objetos;

public abstract class Eletronico {

	private String serial;
	
	public Eletronico(String serial) {
		this.serial = serial;
	}
	
	public String getSerial() {
		return this.serial;
	}
}