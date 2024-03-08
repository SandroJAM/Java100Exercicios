package vetores;

import java.util.Scanner;

public class exercicio100_80 {

	public static void main(String[] args) {
		// Criar um VETOR de números inteiros e verificar se todos os elementos são pares;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do VETOR: ");
		int tamanho = input.nextInt();
		
		int[] vetor = new int[tamanho];
		
		System.out.println("Digite os elementos do VETOR: ");
		for(int i = 0; i < tamanho; i++){
			vetor[i] = input.nextInt();
		}
		
		boolean todosPares = true;
		
		for(int i = 0; i < tamanho; i++){
			if(vetor[i] % 2 != 0){
				todosPares = false;
				break;
			}
		}
		
		if(todosPares) {
			System.out.println("Todos os elementos no VETOR são PARES!");
		} else {
			System.out.println("Existem elementos ÍMPARES no VETOR");
		}
		
		input.close();

	}

}
