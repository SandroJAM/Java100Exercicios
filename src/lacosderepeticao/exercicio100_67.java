package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_67 {

	public static void main(String[] args) {
		// Ler um número e exibir seus divisores!
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número INTEIRO positivo: ");
		int numero = input.nextInt();
		
		System.out.println("Os divisores de " + numero + ": ");
		
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				System.out.println(i);
			}
		}
		input.close();
	}
}