package vetores;

import java.util.Scanner;

public class exercicio100_75 {

	public static void main(String[] args) {
		// Ler um VETOR de números INTEIROS e verificar se está na ORDEM crescente.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o tamaho do VETOR?: ");
		int tamVetor =  entrada.nextInt();
		
		int[] vetor = new int[tamVetor];
		
		System.out.println("Digite os elementos do VETOR: ");
		for (int i = 0; i < tamVetor; i++) {
			vetor[i] = entrada.nextInt();
		}
		
		boolean estaEmOrdemCrescente = true;
		
		for (int i = 0; i < tamVetor - 1; i++) {
			if (vetor[i] > vetor[i + 1]) {
				estaEmOrdemCrescente = false;
				break;
			}
		}
		if (estaEmOrdemCrescente) {
			System.out.println("O VETOR está CRESCENTE!");
		} else {
			System.out.println("O VETOR NÃO está CRESCENTE!");	
		}
		entrada.close();
	}
}