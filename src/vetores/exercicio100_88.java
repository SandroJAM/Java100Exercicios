package vetores;

import java.util.Scanner;

public class exercicio100_88 {

	public static void main(String[] args) {
		// Ler duas matrizes e dê como resposta a multiplicação entre elas;
		// O código deve observar se é possível ou não realizar a multiplicação entre as
		// duas matrizes;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o número de linhas da primeira matriz: ");
		int linhasA = entrada.nextInt();

		System.out.print("Digite o número de colunas da primeira matriz: ");
		int colunasA = entrada.nextInt();

		System.out.print("Digite o número de linhas da segunda matriz: ");
		int linhasB = entrada.nextInt();

		System.out.print("Digite o número de colunas da segunda matriz: ");
		int colunasB = entrada.nextInt();

		// Verifica se a multiplicação é possível;
		if (colunasA != linhasB) {
			System.out.println("Não é possível multiplicar as matrizes!");
			System.exit(0);
		}

		// Cria as matrizes
		int[][] matrizA = new int[linhasA][colunasA];
		int[][] matrizB = new int[linhasB][colunasB];
		int[][] matrizResultado = new int[linhasA][colunasA];

		// Lê os elementos da primeira matriz;
		System.out.println("Informe os elementos para primeira matriz:");
		for (int i = 0; i < linhasA; i++) {
			for (int j = 0; j < colunasA; j++) {
				matrizA[i][j] = entrada.nextInt();
			}
		}

		// Lê os elementos da primeira matriz;
		System.out.println("Informe os elementos para segunda matriz:");
		for (int i = 0; i < linhasB; i++) {
			for (int j = 0; j < colunasB; j++) {
				matrizB[i][j] = entrada.nextInt();
			}
		}

		// Realiza a multiplicação das matrizes;
		for (int i = 0; i < linhasA; i++) {
			for (int j = 0; j < colunasB; j++) {
				for (int k = 0; k < colunasA; k++) {
					matrizResultado[i][j] = +matrizA[i][k] * matrizB[k][j];
				}
			}
		}

		// Exibe Matriz Resultado;
		System.out.println("IMatriz Resultado:");
		for (int i = 0; i < linhasA; i++) {
			for (int j = 0; j < colunasB; j++) {
				System.out.println(matrizResultado[i][j] + " ");
			}
		}

		entrada.close();

	}
}