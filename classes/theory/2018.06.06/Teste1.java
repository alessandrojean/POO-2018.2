import java.util.Scanner;

public class Teste1 {
    
    public static void dobra(int[] vetor) {
        for (int i = 0; i < vetor.length; i++)
            vetor[i] = vetor[i] * 2;
    }
    
    public static int qtosImpares(int[] vetor) {
        int count = 0;
        for (int elemento : vetor)
            if (elemento % 2 == 1)
                count++;
        return count;
    }
    
    public static int qtosImparesVararg(int[] ...vetor) {
        int count = 0;
        for (int[] vetorAtual : vetor) {
            count += qtosImpares(vetorAtual);
        }
        return count;
    }
    
    public static void ordenaSelecaoIterativo(long[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[indiceMenor])
                    indiceMenor = j;
            }
            long tmp = vetor[i];
            vetor[i] = vetor[indiceMenor];
            vetor[indiceMenor] = tmp;
        }
    }
    
    public static void ordenaSelecaoRecursivo(long[] vetor, int indice) {
        if (indice == vetor.length - 1) return;
        
        int indiceMenor = indice;
        for (int i = indice + 1; i < vetor.length; i++) {
            if (vetor[i] < vetor[indiceMenor])
                indiceMenor = i;
        }
        
        long tmp = vetor[indice];
        vetor[indice] = vetor[indiceMenor];
        vetor[indiceMenor] = tmp;
        
        ordenaSelecaoRecursivo(vetor, indice+1);
    }
    
    public static void imprimeVetor(long[] v) {
        for (long elemento : v)
            System.out.print(elemento + " ");
        System.out.print("\n");
    }
    
    public static int calculaComprimento(int numero) {
        int comprimento = 1;
        
        int tmp = numero;
        while (tmp >= 10) {
            tmp /= 10; // tmp = tmp / 10;
            comprimento++;
        }
        
        return comprimento;
    }
    
    public static int comprimentoMaior(int[] vetor) {
        int maiorComprimento = 1;
        for (int elemento : vetor) {
            int comprimentoAtual = calculaComprimento(elemento);
            if (comprimentoAtual > maiorComprimento)
                maiorComprimento = comprimentoAtual;
        }
        return maiorComprimento;
    }
    
    public static void main(String[] args) {
       
        int[] v1 = new int[9];
        int[] v2 = new int[6];
        int[] v3 = new int[6];
        int ret = qtosImparesVararg(v1, v2);
        ret = qtosImparesVararg(v1, v2, v3);
        
        int[] vetor = new int[5];
        for (int i = 0; i < vetor.length; i++)        
            vetor[i] = i*i;
        
        dobra(vetor);
        
        for (int elemento : vetor)
            System.out.println(elemento);
        
        int[] vetor2 = vetor.clone();     
        /*int[] vetor2 = new int[5];
        for (int i = 0; i < vetor2.length; i++)        
            vetor2[i] = vetor[i];*/
        
        System.out.println("..............");
        
        long[] vetorAleatorio = new long[20];        
        for (int i = 0; i < vetorAleatorio.length; i++)
            vetorAleatorio[i] = Math.round(Math.random() * 10) + 1;
        
        imprimeVetor(vetorAleatorio);
        
        //ordenaSelecaoIterativo(vetorAleatorio);
        
        ordenaSelecaoRecursivo(vetorAleatorio, 0);
        
        imprimeVetor(vetorAleatorio);
        
        System.out.println(calculaComprimento(1000));        
    }
    
}
