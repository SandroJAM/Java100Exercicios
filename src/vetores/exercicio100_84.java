package vetores;

import java.util.Scanner;

public class exercicio100_84 {

	public static void main(String[] args) {
		// Preencher uma MATRIZ 5x5 com inteiros e exibir o MAIOR VALOR da MATRIZ.
		int[][] matriz = new int [5][5];
		int maiorValor = Integer.MIN_VALUE;
		int linhaMaiorValor = 0;
		int colunaMaiorValor = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		// Preenchendo a MATRIZ;
		System.out.println("Digite os valores da MATRIZ: ");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				matriz[i][j] = entrada.nextInt();
				
				// Verificar se o VALOR é o MAIOR que o MAIORVALOR atual;
				if(matriz[i][j] > maiorValor) {
					maiorValor = matriz[i][j];
					linhaMaiorValor = i;
					colunaMaiorValor = j;
				}
				
			}
		}
		
		// Exibindo o MAIOR VALOR e sua POSIÇÃO na MATRIZ;
		System.out.println("O MAIOR VALOR na MATRIZ é: " + maiorValor);
		System.out.println("Ele está na POSIÇÃO: ["+linhaMaiorValor+"]["+colunaMaiorValor+"]");
		
		entrada.close();
		
	}
}