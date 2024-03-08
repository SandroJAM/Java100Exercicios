package vetores;

import java.util.Scanner;

public class exercicio100_77 {

	public static void main(String[] args) {
		// CRiar um VETOR de números interios e encontrar o segundo maior elemento presente no VETOR;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do VETOR: ");
		int tamanho = entrada.nextInt();
		
		int[] vetor  = new int[tamanho];
		
		System.out.println("Digite os elementos do VETOR:");
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = entrada.nextInt();
		}
		
		int maior = Integer.MIN_VALUE;
		int segundoMaior = Integer.MAX_VALUE;
		
		for (int i = 0; i < tamanho; i++ ) {
			if(vetor [i] > maior) {
				segundoMaior = maior;
				maior = vetor[i];
			} else if(vetor[i] > segundoMaior && vetor[i] != maior) {
				segundoMaior = vetor[i];
			}
		}

		if (segundoMaior != Integer.MIN_VALUE) {
			System.out.println("O segundo maior elemento é: " + segundoMaior);
		} else {
			System.out.println("Não foi encontrado um segundo maior elemento no VETOR!");
		}
		
		entrada.close();

	}
}