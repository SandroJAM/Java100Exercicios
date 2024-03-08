package vetores;

import java.util.Scanner;

public class exercicio100_89 {

	public static void main(String[] args) {
		// Ler uma matriz 4x4 e verificar se a mesma é diagonal;
		// Se todos os elementos da diagonal principal são iguais a zero;
		
		Scanner input = new Scanner(System.in);
		
		int tamanho = 4;
		int[][] matriz = new int[tamanho][tamanho];
		
		// Leitura dos elementos da matriz;
		for(int i = 0; i < tamanho; i++) {
			for(int j = 0; j < tamanho; j++) {
				System.out.println("Digite o elemento da posição [" + i + "][" + j + "]: ");
				matriz[i][j] = input.nextInt();
			}
		}
		
		boolean ehDiagonal = true;
		
		// Verificação de Diagonal;
		for(int i = 0; i < tamanho; i++) {
			for(int j = 0; j < tamanho; j++) {
				if(i != j && matriz[i][j] != 0) {
					ehDiagonal = false;
				}
			}
			if(!ehDiagonal) {
				break;
			}
		}
		
		// Exibição do Resultado
		if(ehDiagonal) {
			System.out.println("A MATRIZ é Diagonal!");
		} else {
			System.out.println("A MATRIZ não é Diagonal!");
		}
		
		input.close();

	}
}