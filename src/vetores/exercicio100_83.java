package vetores;

import java.util.Scanner;

public class exercicio100_83 {

	public static void main(String[] args) {

		// Ler duas MATRIZES e exibir a soma das duas.

		int[][] matriz1 = new int[2][2];
		int[][] matriz2 = new int[2][2];
		int[][] resultado = new int[2][2];

		Scanner entrada = new Scanner(System.in);

		// Lendo a primeira MATRIZ.

		System.out.println("Digite os valores da primeira MATRIZ: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matriz1[i][j] = entrada.nextInt();
			}
		}

		// Lendo a segunda MATRIZ.

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matriz2[i][j] = entrada.nextInt();
			}
		}
		
		// Calculando a soma das matrizes
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				resultado[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		
		// Exibindo a MATRIZ resultado
		
		System.out.println("A MATRIZ SOMA é: ");
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(resultado[i][j] + " ");
			}
		}
		
		entrada.close();
		
	}
}