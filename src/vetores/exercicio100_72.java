package vetores;

import java.util.Scanner;

public class exercicio100_72 {

	public static void main(String[] args) {
		// Ler um VETOR de números e exibir o maior elemento prsente no VETOR.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade a inserir no VETOR: ");
		int qtdeElementos = entrada.nextInt();
		
		int[] vetor = new int[qtdeElementos];
		
		System.out.println("Digite os elementos do VETOR: ");
		for (int i = 0; i < qtdeElementos; i++) {
			System.out.println("Elemento " + (i + 1) + ": ");
			vetor[i] = entrada.nextInt();
		}
		int maior = vetor[0];
		for (int i = 1; i < qtdeElementos; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i]
;			}
		}
		System.out.println("O maior elemento do VETOR é: " + maior);
		entrada.close();
	}
}