package formulasmatematicas;

import java.util.Scanner;

public class exercicio100_15 {

	public static void main(String[] args) {
		// Calcular e exibir o volume de um raio
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio da esfera: ");
		double raio = scan.nextDouble();
		
		double volume = (4.0 / 3.0 * Math.PI * Math.pow(raio, 3));
		
		System.out.println("O volume da esfera é: " + volume);
		
		scan.close();
		
	}

}
