package universidade;

import autenticacao.*;

public class ListaNotas {

	private ItemNota[] listaDeNotas;
	private int itensArmazenados = 0;
	
	public ListaNotas(int tamanhoMax) {
		this.listaDeNotas = new ItemNota[tamanhoMax];
	}
	
	public void adicionarItemNota(ItemNota item) {
		listaDeNotas[itensArmazenados++] = item;
	}
	
	public void imprimirNotasAula(IMetodoAutenticacao metodoAutenticacao) {
		try {
			UsuarioAutenticado usuario = metodoAutenticacao.autenticar();
			
			System.out.println("Notas do aluno: " + usuario.getNome());
			System.out.println("------------------------------");
			for (ItemNota item : listaDeNotas) {
				if ((item != null) && (item.getCodigo() == usuario.getCodigo()))
					System.out.println("- " + item);
			}
			System.out.println("------------------------------\n");
			
		} catch (UsuarioNaoAutenticadoException e) {
			System.out.println("Impressao nao autorizada: " + e);
		}
	}

}