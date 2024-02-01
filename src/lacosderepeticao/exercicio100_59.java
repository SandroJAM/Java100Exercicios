package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_59 {

	public static void main(String[] args) {
		// Ler dois números e exibir os números entre eles!
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor do primeiro número (A): ");
		int priNum = input.nextInt();
		System.out.print("Digite o valor do segundo número (B): ");
		int segNum= input.nextInt();
		
		System.out.println("\nOs número entre " + priNum + " e " + segNum + " são: ");
		
		if (priNum < segNum) {
			for (int i = priNum + 1; i < segNum; i++) {
				System.out.printf(i + " ");
			}
		} else {
			for (int i = segNum + 1; i < priNum; i++)
				System.out.printf(i + " ");
		}
		input.close();
	}
}