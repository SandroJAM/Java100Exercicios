package condicionais;

import java.util.Scanner;

public class exercicio100_29 {

	public static void main(String[] args) {
		// Ler um número e informar se ele é par ou ímpar
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scan.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O número é PAR!");
		} else {
			System.out.println("O número é ÍMPAR!");
		}
		
		scan.close();

	}

}
