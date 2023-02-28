package Controller;

public class OperacoesDigitos {

	public OperacoesDigitos() {
		super();
		
	}
	
	public int Digitos(int n) {
		if(n == 0) { // condição de parada
			return 0;
		} else {
			return 1 + Digitos(n/10); // chamada da função
		}
	}

}
