package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_56 {

	public static void main(String[] args) {
		// Ler um número e exibir todos os número PRIMOS menores que o número lido!
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número INTEIRO: ");
		int numero = input.nextInt();
		
		for (int i = 2; i < numero; i++) {
			
			boolean ehPrimo = true;
			
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					ehPrimo = false;
					break;
				}
			}	
			if (ehPrimo) {
				System.out.println(i + " ");
			}
		}
		input.close();
	}
}