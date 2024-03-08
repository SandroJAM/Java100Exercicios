package vetores;

import java.util.Scanner;

public class exercicio100_81 {

	public static void main(String[] args) {
		// Preencher uma matriz 3 x 3 com valores informador pelo usuário e exibir a soma dos valores.
		
		Scanner entrada = new Scanner(System.in);
		
		int [][] matriz = new int [3][3];
		
		System.out.println("Digite os valores da MATRIZ 3x3: ");
		
		// Preenchendo a matriz com os valores informados pelo usuário.
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Digite o valor para a posição [" + i + "][" + j + "]: ");
				matriz[i][j] = entrada.nextInt();
			}
		}
		
		// Calculando a soma dos valores da diagonal principal.
		int somaDiagonal = 0;
		for(int i = 0; i < 3; i++) {
			somaDiagonal += matriz[i][i];
		}
		
		System.out.println("A soma dos valores da Diagonal Principal é: " + somaDiagonal);
		
		entrada.close();

	}

}