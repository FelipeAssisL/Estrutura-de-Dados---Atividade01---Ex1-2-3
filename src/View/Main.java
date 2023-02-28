package View;
import java.util.Scanner;

import Controller.OperacoesFat;
import Controller.OperacoesVetorNeg;
import Controller.OperacoesDigitos;

public class Main {
	
	public static void main(String args[]) {
		
		OperacoesFat OC = new OperacoesFat();
		OperacoesVetorNeg OV = new OperacoesVetorNeg();
		OperacoesDigitos OD = new OperacoesDigitos();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");

		int n = sc.nextInt();
		while(n > 12) {
			System.out.println("Digite um entre 0 e 12");
			 n = sc.nextInt();
		}
		 
		int fatorial = OC.Fat(n);
		
		int[] vetor = new int [5];
		
		for (int i = 0; i<vetor.length; i++) {
			System.out.println("Digite um valor para carregar no vetor: ");
			vetor[i] = sc.nextInt();
		}
		
		sc.close();
		int tamanho = vetor.length;
		int vetorneg = OV.VetorNegativo(vetor, tamanho);
		
		int dig = OD.Digitos(n);
		
		System.out.println("O fatorial de " + n + " é: " + fatorial);
		System.out.println("A quantidade de valores negativos no vetor é: " + vetorneg);
		System.out.println("O valor informado possui "+dig+" digito(s)");
	}
}
