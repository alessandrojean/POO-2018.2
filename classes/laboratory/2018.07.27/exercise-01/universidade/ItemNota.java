package universidade;

public class ItemNota {

	private int codAluno;
	private String disciplina;
	private double nota;
	
	public ItemNota(int codAluno, String disciplina, double nota) {
		this.codAluno = codAluno;
		this.disciplina = disciplina;
		this.nota = nota;
	}
	
	public int getCodigo() {
		return this.codAluno;
	}
	
	@Override
	public String toString() {
		return "[" + codAluno + "] " + disciplina + " Nota=" + nota;
	}

}