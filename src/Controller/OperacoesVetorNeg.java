package Controller;

public class OperacoesVetorNeg {

	public OperacoesVetorNeg() {
		super();
	}
	
	public int VetorNegativo(int[]vetor, int tamanho) {
		
		if(tamanho == 0) {//Codição de parada
			return 0;
		}else {
			int fimvet = tamanho - 1;
			int valor = vetor[fimvet];
			int negativo = 0;
			if(valor<0) {
				negativo = negativo +1;
			}
			return negativo + VetorNegativo(vetor, tamanho-1); // Chamada da função
		}
	}
}
