package vetores;

import java.util.Scanner;

public class exercicio100_87 {

	public static void main(String[] args) {
		// Ler uma MATRIZ 3x3 e calcular o DETERMINATE da MATRIZ;
		
		int [][] matriz = new int [3][3];
		Scanner entrada = new Scanner(System.in);
		
		// Lendo os elementos da MATRIZ;
		System.out.println("Digite os elementos da MATRIZ 3x3:");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matriz[i][j] = entrada.nextInt();
			}
		}
		
		// Calculando o Determinante da MATRIZ;
		int determinante = (matriz[0][0] * matriz[1][1] * matriz[2][2])
				+ (matriz[0][1] * matriz[1][2] * matriz[2][0])
				+ (matriz[0][2] * matriz[1][0] * matriz[2][1])
				- (matriz[0][2] * matriz[1][1] * matriz[2][0])
				- (matriz[0][0] * matriz[1][2] * matriz[2][1])
				- (matriz[0][1] * matriz[1][0] * matriz[2][2]);
		
		// Exibindo o DETERMINANTE;
		System.out.println("Determinante: " + determinante);
		entrada.close();
	}
}