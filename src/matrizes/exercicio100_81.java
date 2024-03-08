package matrizes;

import java.util.Scanner;

public class exercicio100_81 {

	public static void main(String[] args) {
		// Preencher uma MATRIZ 3 x 3, com números informados pelo usuário e exibir a soma dos valores da diagonal;
		
		Scanner entrada = new Scanner(System.in);
		
		int[] [] matriz = new int[3][3];
		
		System.out.println("Digite os valores da MATIRZ 3X3: ");
		
		// Preenchendo aMATRIZ com valores informado pelo usuário;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
				matriz[i][j] = entrada.nextInt();
			}
		}
		
		// Calculando a soma dos valores da diagonal principal;
		
		int somaDiagonal = 0;
		for(int i = 0; i < 3; i++) {
			somaDiagonal += matriz[i][i];
		}
		
		System.out.println("A SOMA dos valores da diagonal principal é: " + somaDiagonal);
		
		entrada.close();
	}
}