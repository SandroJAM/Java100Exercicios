package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_57 {

	public static void main(String[] args) {
		// Exibir os primeiros números PRIMOS do número informado pelo usuário!
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de números PRIMOS desejado: ");
		int quantidade = input.nextInt();
		
		System.out.print("Os primeiros " + quantidade + " números PRIMOS são: ");
		
		int numero = 2;
		int contador = 0;
		
		while (contador < quantidade) {
			boolean isPrimo = true;
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					isPrimo = false;
					break;
				}
			}
			if (isPrimo) {
				System.out.print(numero + " ");
				contador++;
			}
		}
		input.close();
	}
}