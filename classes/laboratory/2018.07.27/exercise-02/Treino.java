public class Treino {

	public static void main(String[] args) {
		Penalty p = construirPenalty(args);
		
		int acertosCobrador = 0;
		int defesas = 0;
		
		for (int i = 0; i < 3; i++)
			if (p.cobrar())
				acertosCobrador++;
			else
				defesas++;

		Jogador cobrador = p.getCobrador();
		Jogador goleiro = p.getGoleiro();
			
		System.out.println("[" + cobrador.getNome() + "] Gols = " + acertosCobrador 
						+ "  [" + goleiro.getNome() + "] Defesas = " + defesas);
	}

	private static Penalty construirPenalty(String[] args) {
		char estrategiaCobrador = args[0].charAt(0);
		char estrategiaGoleiro = args[1].charAt(0);

		CobradorStrategy cobrador = (estrategiaCobrador == 'C')
			? new CobradorComputador()
			: new CobradorPessoa("Saul");

		GoleiroStrategy goleiro = (estrategiaGoleiro == 'C')
			? new GoleiroComputador()
			: new GoleiroPessoa("Paulo");

		return new Penalty(goleiro, cobrador);
	}

}