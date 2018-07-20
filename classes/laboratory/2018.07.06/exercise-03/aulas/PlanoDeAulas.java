package aulas;

public class PlanoDeAulas implements PlanoFacil, PlanoDificil {

	private Aula[] listaDeAulas;
	private String nomeDisciplina;
	
	public PlanoDeAulas(String nomeDisciplina, int nAulas) {
		this.listaDeAulas = new Aula[nAulas];
		this.nomeDisciplina = nomeDisciplina;
	}
	
	public void adicionarAula(Aula novaAula) throws Exception {
		int indiceAdicionar = -1;
		for (int i = 0; i < listaDeAulas.length && indiceAdicionar == -1; i++)
			if (listaDeAulas[i] == null)
				indiceAdicionar = i;
		
		if (indiceAdicionar == -1)
			throw new Exception("Lista aulas esta cheia!");
			
		listaDeAulas[indiceAdicionar] = novaAula;
	}
	
	public void imprimirPlano() {
		System.out.println("Plano da disciplina: " + nomeDisciplina);
		for (int i = 0; i < listaDeAulas.length; i++)
			if (listaDeAulas[i] != null)
				System.out.println("- [" + listaDeAulas[i].getTipo() + "] " + listaDeAulas[i].getDescricao());
	}
	
	public String getFormulaAvaliacao() {
		String formula = "";
		for (int i = 0; i < listaDeAulas.length; i++)
			if (listaDeAulas[i] != null && listaDeAulas[i] instanceof Avaliacao) {
				if (!formula.equals(""))
					formula += " + ";
				formula += ((Avaliacao)listaDeAulas[i]).getPeso() + " x " + listaDeAulas[i].getDescricao();
			}
		return formula;
	}
	
	@Override
	public void cancelarProvas() {
		for (int i = 0; i < listaDeAulas.length; i++)
			if (listaDeAulas[i] != null && listaDeAulas[i] instanceof Prova)
				listaDeAulas[i] = null;
	}
	
	public void adicionarProvaSurpresa() throws Exception {
		adicionarProvaSurpresa(0.8);
	}
	
	@Override
	public void adicionarProvaSurpresa(double peso) throws Exception {
		adicionarAula(new Prova(peso));
	}
	
	private void mostrarEstadoVetorAulas() {
		for (int i = 0; i < listaDeAulas.length; i++)
			System.out.print(listaDeAulas[i] == null ? "0" : "1");
		System.out.println();
	}

}