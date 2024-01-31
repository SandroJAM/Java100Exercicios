package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_55 {

	public static void main(String[] args) {
		// Ler um número e exibir se o mesmo é primo!
		// Número PRIMOS - São números que só tem como divisores ele mesmo e o número 1. 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número INTEIRO: ");
		int numero = input.nextInt();
		
		boolean ehPrimo = true;
		
		if (numero <= 1 ) {
			ehPrimo = false;
		} else {
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					ehPrimo = false;
					break;
				}
			}
		}
		if (ehPrimo ) {
			System.out.println(numero + " É um número PRIMO!");
		} else {
			System.out.println(numero + " NÃO é um número PRIMO!");
		}
		input.close();
	}
}