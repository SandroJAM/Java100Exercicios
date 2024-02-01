package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_69 {

	public static void main(String[] args) {
		// Determinar o MDC entre dois números!
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int numero1 = input.nextInt();
		System.out.println("Digite o segundo número: ");
		int numero2 = input.nextInt();
		int mdc = 1;
		int menorNumero = Math.min(numero1, numero2);
		for (int i = 1; i <= menorNumero; i++) {
			if (numero1 % i ==0 && numero2 % i == 0) {
				mdc = i;
			}
		}
		
		System.out.println("Resultado: " + mdc);
		input.close();

	}
}