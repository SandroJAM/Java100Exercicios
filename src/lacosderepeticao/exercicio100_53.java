package lacosderepeticao;

public class exercicio100_53 {

	public static void main(String[] args) {
		// Calcular e exibir dos números de 1 a 100 utilizando de repetição!
		
		int totalDeNumeros = 0;
		int somaDosNumeros = 0;
		
		for (int i = 2; i <= 100; i += 2) {
			 totalDeNumeros+= 1;
			 somaDosNumeros+= i;
		}
		System.out.println("A TOTAL dos números pares de 1 a 100 é: " + totalDeNumeros);
		System.out.println();
		System.out.println("A SOMA dos números pares de 1 a 100 é: " + somaDosNumeros);
	}
}