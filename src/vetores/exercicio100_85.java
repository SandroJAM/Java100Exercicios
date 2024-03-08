package vetores;

import java.util.Scanner;

public class exercicio100_85 {

	public static void main(String[] args) {
		// Ler uma MATRIZ 3x3, calcular a média dos valores presentes nas posiçães PARES da MATRIZ
		// Somar os índices PARES
		
		int [][] matriz = new int[3][3];
		int soma = 0;
		int qtde = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		// Preenchendo a MATRIZ;
		
		System.out.println("Digite os valores da MATRIZ: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matriz [i][j] = entrada.nextInt();
				
				// Verificando se a posição é PAR;
				if ((i + j) % 2 == 0){
					soma += matriz[i][j];
					qtde ++;
				}
				
			}
		}
		
		// Calculando a MÉDIA;
		double media = (double) soma / qtde;
		// Exibindo a MÈDIA;
		System.out.println("A MÉDIA dos valores presentes nas posições PARES é: " + media);
		
		entrada.close();
		
	}
}