package vetores;

import java.util.Scanner;

public class exercicio100_78 {

	public static void main(String[] args) {
		// Criar um VETOR de números inteiros e exibir quantas vezes um número específico aparece nesse VETOR;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do VETOR: ");
		int tamanho = input.nextInt();
		
		int[] vetor = new int[tamanho];
		
		System.out.println("Digite os elementos do VETOR: ");
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = input.nextInt();
		}
		
		System.out.println("Digite o número a ser buscado: ");
		int numeroBuscado = input.nextInt();
		
		int contagem = 0;
		for(int i = 0; i < tamanho; i++){

			if(vetor[i] == numeroBuscado) { 
				contagem++;
			}
		}
		
		System.out.print("O número " + numeroBuscado + " aparece " + contagem + " vezes!");
	
		input.close();

	}
}