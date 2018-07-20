package estrutura;

public class FilaSimples {

	private int inicio, fim;
	private Object[] itens;
	
	public FilaSimples(int tamanhoMax) {
		this.itens = new Object[tamanhoMax];
		this.inicio = 0;
		this.fim = 0;
	}
	
	public void enfileira(Object novoItem) {
		itens[fim] = novoItem;
		fim = (fim + 1) % getTamanhoMax();
	}
	
	public Object desenfileira() {
		Object item = itens[inicio];
		itens[inicio] = null;
		inicio = (inicio + 1) % getTamanhoMax();
		return item;
	}
	
	int getInicio() {
		return this.inicio;
	}
	
	int getFim() {
		return this.fim;
	}
	
	int getTamanhoMax() {
		if (itens != null)
			return this.itens.length;
		else
			return -1;
	}

}