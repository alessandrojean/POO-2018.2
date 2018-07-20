package aulas;

public abstract class Aula {

	private String descricao;
	
	public Aula(String descricao) {
		this.descricao = descricao;
	}	
	public String getDescricao() {
		return this.descricao;
	}
	
	public abstract String getTipo();
}