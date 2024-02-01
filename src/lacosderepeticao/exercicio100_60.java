package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_60 {

	public static void main(String[] args) {
		// Ler vários números até receber um número negativo e exibir a soma do números lidos!
		
		Scanner input = new Scanner(System.in);
		
		int numero;
		int soma = 0;

		System.out.print("Digite um número (Negativo para sair): ");
		do {
			numero = input.nextInt();
			if (numero > 0) {
				soma += numero;
			}
		} while (numero >= 0);
		
		System.out.println("A soma dos números positivos é: " + soma);		
		input.close();
	}
}