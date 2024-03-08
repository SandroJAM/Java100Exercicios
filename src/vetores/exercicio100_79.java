package vetores;

import java.util.Scanner;

public class exercicio100_79 {

	public static void main(String[] args) {
		// Criar dois VETORES de números inteiros e exibir um novo VETOR com os elementos resultante de multiplicação;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do VETOR: ");
		int tamanho = input.nextInt();
		
		int [] vetor1 = new int[tamanho];
		int [] vetor2 = new int[tamanho];
		int [] vetorResultado = new int[tamanho];
		
		System.out.println("Informe os elementos do primeiro VETOR: ");
		for(int i = 0; i < tamanho; i++){
			vetor1[i] = input.nextInt();
		}
		
		System.out.println("Informe os elementos do segundo VETOR: ");
		for(int i = 0; i < tamanho; i++){
			vetor2[i] = input.nextInt();
		}
		
		// Multiplicar os VETORES => vetor1 e vetor2
		
		for(int i = 0; i < tamanho; i++){
			vetorResultado[i] = vetor1[i] * vetor2[i];
		}
		
		// Exibir o resultado da multiplicação
		
		System.out.println("VETOR Resultado: ");
		for(int i = 0; i < tamanho; i++){
			System.out.println(vetorResultado[i] + " ");
		}
		
		input.close();

	}
}