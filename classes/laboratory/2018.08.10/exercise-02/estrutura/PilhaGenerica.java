package estrutura;

import java.util.ArrayList;

public class PilhaGenerica<T> {

	private int topo, tamanhoMax;
	private ArrayList<T> itens;
	
	public PilhaGenerica(int tamanhoMax) {
		this.itens = new ArrayList<>(tamanhoMax); // Este construtor de ArrayList define um tamanho inicial para o array
		this.topo = -1;
		this.tamanhoMax = tamanhoMax;
	}
	
	public void empilha(T novoItem) {
		if (getTopo() == getTamanhoMax() - 1)
			throw new PilhaCheiaException(getTamanhoMax(), novoItem);
		
		itens.add(++topo, novoItem);
	}
	
	public T desempilha() {
		// verificar pilha vazia
		if (getTopo() == -1)
			throw new PilhaVaziaException();
		
		T item = itens.get(topo);
		itens.remove(topo--);
		return item;
	}
	
	int getTopo() {
		return this.topo;
	}
	
	int getTamanhoMax() {
		return this.tamanhoMax;
	}
}
