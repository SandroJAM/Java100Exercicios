package vetores;

import java.util.Random;

public class exercicio100_86 {

	public static void main(String[] args) {
		// preencher uma MATRIZ 4x4 com número aleatórios e exibir a soma dos valores
		// presentes em cada linha e coluna;

		int[][] matriz = new int[4][4];
		Random random = new Random();

		// Preenchendo a MATRIZ com números ALEATÒRIOS;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = random.nextInt(100);
			}
		}

		// Exibindo a MATRIZ;
		System.out.println("MATRIZ: ");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		// Calculando a SOMA das LINHAS;
		System.out.println("SOMA das LINHAS:");
		for (int i = 0; i < 4; i++) {
			int somaLinha = 0;
			for (int j = 0; j < 4; j++) {
				somaLinha += matriz[i][j];
			}
			System.out.println("Linha " + (i + 1) + ": " + somaLinha);
		}

		// Calculando a SOMA das COLUNAS;
		System.out.println("Soma das Colunas: ");
		for (int j = 0; j < 4; j++) {
			int somaColuna = 0;
			for (int i = 0; i < 4; i++) {
				somaColuna += matriz[i][j];
			}
			System.out.println("Coluna " + (j + 1) + ": " + somaColuna);
		}
	}
}