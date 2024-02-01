package vetores;

import java.util.Scanner;

public class exercicio100_71 {

	public static void main(String[] args) {
		// VETOR de números inteiros!
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor: ");
		int numero = input.nextInt();
		
		int[] vetor = new int[numero];
		
		System.out.println("Digite os elementos do vetor: ");
		for (int i = 0; i < numero; i++) {
			vetor[i] = input.nextInt();
		}
		
		int soma = 0;
		for (int i = 0; i < numero; i++) {
			soma += vetor[i];
		}
		System.out.println("A soma dos elementos é: " + soma);
		input.close();
	}
}