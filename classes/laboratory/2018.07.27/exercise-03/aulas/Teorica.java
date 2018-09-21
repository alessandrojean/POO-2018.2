package aulas;

public class Teorica extends Aula {

	public Teorica(String descricao) {
		super(descricao);
	}

	@Override
	public String getTipo() {
		return "Teorica";
	}

}