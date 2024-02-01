package vetores;

import java.util.Scanner;

public class exercicio100_74 {

	public static void main(String[] args) {
		// Ler dois VETORES inteiros co mesmo tamanho e exibir a soma
		// desses VETORES e um novo VETOR.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual o tamanho dos VETORES?: ");
		int tamanho = input.nextInt();
		int [] vetor1 = new int[tamanho];
		int [] vetor2 = new int[tamanho];
		int [] vetorSoma = new int[tamanho];
		
		System.out.println("Digite os ELEMENTOS do VETOR1: ");
		for (int i = 0; i < tamanho; i++) {
			vetor1[i] = input.nextInt();
		}
		
		System.out.println("Digite os ELEMENTOS do VETOR2: ");
		for (int i = 0; i < tamanho; i++) {
			vetor2[i] = input.nextInt();
		}
		
		for (int i = 0; i < tamanho; i++) {
			vetorSoma[i] = vetor1[i] + vetor2[i];
		}
		
		System.out.println("A soma dos VETORES é: ");
		for (int i = 0; i < tamanho; i++) {
			System.out.println(vetorSoma[i] + " ");
		}
		
		input.close();
		
	}
}