package estrutura;

public class PilhaSimples {

	private int topo;
	private Object[] itens;
	
	public PilhaSimples(int tamanhoMax) {
		this.itens = new Object[tamanhoMax];
		this.topo = -1;
	}
	
	public void empilha(Object novoItem) {
		itens[++topo] = novoItem;
	}
	
	public Object desempilha() {
		Object item = itens[topo];
		itens[topo--] = null;
		return item;
	}
	
	int getTopo() {
		return this.topo;
	}
	
	int getTamanhoMax() {
		if (itens != null)
			return this.itens.length;
		else
			return -1;
	}

}