import autocorrecao.*;

public class Principal {

	public static void main(String[] args) {
	
		try {
			MultiplaEscolha p1 = new MultiplaEscolha("Quanto eh 2 + 2?");
			Alternativa a1 = new Alternativa("80");
			Alternativa a2 = new Alternativa("4");
			p1.adicionaAlternativa(a1);
			p1.adicionaAlternativa(a2);
			
			
			Pergunta p2 = new MultiplaEscolha("Quanto eh 1 + 1?", 3);
			MultiplaEscolha p3 = (MultiplaEscolha) p2;
			Alternativa a3 = new Alternativa("80");
			Alternativa a4 = new Alternativa("2");
			Alternativa a5 = new Alternativa("9");
			p3.adicionaAlternativa(a3);
			p3.adicionaAlternativa(a4);
			p3.adicionaAlternativa("700");
			
			Pergunta p4 = new VerdadeiroFalso("int[] v = new int[3] cria um vetor com 3 nulls");		
		
			Prova prova = new Prova();
			prova.adicionaPergunta(p1);
			prova.adicionaPergunta(p3);
			prova.adicionaPergunta(p4);
			prova.imprimirProva();
		} catch (Exception e) {
			System.out.println("Deu erro :-(");
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
	}

}