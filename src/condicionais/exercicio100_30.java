package condicionais;

import java.util.Scanner;

public class exercicio100_30 {

	public static void main(String[] args) {
		// Ler um número e informar se o mesmo é positivo, negativo ou zero.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scan.nextInt();
		
		if (numero > 0) {
			System.out.println("O número é POSITIVO!");
		} else if (numero < 0) {
			System.out.println("O número é NEGATIVO!");
		} else {
			System.out.println("O número é ZERO!");
		}
		
		scan.close();

	}

}