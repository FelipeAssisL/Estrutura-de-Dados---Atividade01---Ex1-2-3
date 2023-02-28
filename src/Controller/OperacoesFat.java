package Controller;

public class OperacoesFat {

	public OperacoesFat() {
		super();
	}

	public int Fat(int n) {
		int fat = 0;
		if(n==0) { // Condição de parada
			return 1;
		}
		else {
			fat = n*Fat(n-1); //chamada da função
			return fat;
		}
	}
}
