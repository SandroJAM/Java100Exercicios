package vetores;

import java.util.Scanner;

public class exercicio100_73 {

	public static void main(String[] args) {
		// Inserir uma quantidade de elementos a um VETOR e exibir a média dos elementos
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de elementos do VETOR: ");
		int qtdeElemen = scan.nextInt();
		
		int vetor[] = new int[qtdeElemen];
		
		System.out.println("Digite os ELEMENTOS do VETOR:");
		
		for (int i = 0; i < qtdeElemen; i++) {
			System.out.println("Elemento " + (i + 1) + ": ");
			vetor[i] = scan.nextInt();
		}
		
		int soma = 0;
		
		for (int i = 0; i < qtdeElemen; i++) {
			soma += vetor[i];
		}
		
		double media = (double) soma / qtdeElemen;
		System.out.println("A MEDIA dos elementos do VETOR é: " + media);
		scan.close();	
	}
}