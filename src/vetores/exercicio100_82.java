package vetores;

import java.util.Random;

public class exercicio100_82 {

	public static void main(String[] args) {
		// Preencha uma MATRIZ 4x4 com valores aleatórios e exibir a MATRIZ transposta.
		
		int [][] matriz = new int [4][4];
		
		// Preenchedo a matriz com valores aleatórios
		
		Random random = new Random();
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				matriz [i][j] =  random.nextInt(10); // Gera um número aleatório entre 0 e 9.
			}
		}
		
		System.out.println("matriz Original:");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		// Calculando e exibindo a MATRIZ TRANSPOSTA.
		int[][] matrizTransposta = new int[4][4];
		for(int i = 0; i < 4; i++) {
			for(int  j = 0; j < 4; j++) {
				matrizTransposta[j][i] = matriz[i][j];
			}
		}
		
		System.out.println("Matriz Transposta:");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(matrizTransposta[i][j] + " ");
			}
			System.out.println();
		}
	}
}