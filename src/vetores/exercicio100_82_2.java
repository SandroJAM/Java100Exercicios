package vetores;

import java.util.Random;

// Declarando Funções

public class exercicio100_82_2 {
	public static void main(String[] args) {
		int[][] matriz = new int[4][4];

		// Preenchendo a MATRIZ com valores ALEATÓRIOS.
		Random random = new Random();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = random.nextInt(10); // Gera um número aleatório entre 0 e 9.
			}
		}

		System.out.println("Matriz Original:");

		exibirMatriz(matriz);

		int[][] matrizTransposta = calcularMatrizTransposta(matriz);

		System.out.println("Matriz Transposta");
		exibirMatriz(matrizTransposta);
	}

   // Método para exibir uma MATRIZ.

	public static void exibirMatriz(int[][] matriz) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

    // Método para calcular a MATRIZ TRANSPOSTA.
	public static int[][] calcularMatrizTransposta(int[][] matriz) {
		int[][] matrizTransposta = new int[matriz.length][matriz[0].length];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matrizTransposta[j][i] = matriz[i][j];
			}
		}

		return matrizTransposta;

	}
}