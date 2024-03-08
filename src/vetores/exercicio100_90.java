package vetores;

import java.util.Scanner;

public class exercicio100_90 { // Class campoMinado;

	public static void main(String[] args) {
		// Ler uma MATRIZ M x N, indicando o local onde há minas de um jogo de campo
		// minado
		// Sendo 0 para campo neutro e 1 para contém minas e retornar uma MATRIZ
		// indicando
		// para cada posição de minas nas casas vizinhas.

		Scanner input = new Scanner(System.in);

		// Leitura das dimensões da matriz;
		System.out.println("Digite o número de linhas da matriz: ");
		int linhas = input.nextInt();
		System.out.println("Digite o número de colunas da matriz: ");
		int colunas = input.nextInt();

		// Cria a Matriz;
		int[][] campoMinado = new int[linhas][colunas];

		// Leitura da Matriz;
		System.out.println("Digite a matriz indicando os locais das minas: ");
		System.out.println("0 para campo neutro e 1 para mina: ");

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				campoMinado[i][j] = input.nextInt();
			}
		}

		// Criar a matriz com contagem de minas nas casas vizinhas;
		int[][] resultado = new int[linhas][colunas];

		// Iteração pela matriz campoMinado;
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				// Verifica se a posição atual contém uma mina;
				if (campoMinado[i][j] == 1) {
					// incrementa o número de minas nas casas vizinhas;
					incrementarVizinhos(resultado, i, j);
				}
			}
		}

		// Exibição da matriz resultado;
		System.out.println("Matriz com a contagem de minas nas casas vizinhas:");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.println(resultado[i][j] + " ");
			}
			System.out.println();
		}

		input.close();
	}

	// Método para incrementar o número de minas nas casas vizinhas;
	public static void incrementarVizinhos(int[][] matriz, int linha, int coluna) {
		int linhas = matriz.length;
		int colunas = matriz.length;

		// Verificação dos vizinhos em torno da posição atual;
		for (int i = 0; i <= linha + 1; i++) {

			for (int j = coluna - 1; j <= coluna + 1; j++) {
				// Verificar se a posição é válida e não é a posição atual;
				if (i >= 0 && i < linhas && j >= 0 && j < colunas && !(i == linha && j == colunas)) {
					matriz[i][j]++;
				}
			}
		}
	}
}