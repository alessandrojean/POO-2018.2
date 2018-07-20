package aulas;

public class Pratica extends Aula {

	public Pratica(String descricao) {
		super(descricao);
	}

	@Override
	public String getTipo() {
		return "Pratica";
	}
}