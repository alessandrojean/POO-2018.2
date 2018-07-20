package aulas;

public class Prova extends Avaliacao {

	public Prova() {
		super();
	}

	public Prova(double peso) {
		super(peso);
	}

	@Override
	public String getTipo() {
		return "Prova";
	}

}