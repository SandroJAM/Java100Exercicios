package vetores;

import java.util.Scanner;

public class exercicio100_76 {

	public static void main(String[] args) {
		// Ler um VETOR de números inteiros e exibe os elementos na ordem inversa!
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o tamanho do VETOR: ");
		int tamanho = entrada.nextInt();
		
		int [] vetor = new int[tamanho];
		
		System.out.println("Digite os elementos do VETOR ");
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = entrada.nextInt();
		}
		System.out.println("Elementos do VETOR na ordem inversa: ");
		for (int i = tamanho - 1; i >= 0; i--) {
			System.out.printf(vetor[i] + " ");
		}
		
		entrada.close();

	}

}