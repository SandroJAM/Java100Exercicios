package formulasmatematicas;

import java.util.Scanner;

public class exercicio100_14 {

	public static void main(String[] args) {
		// Posição x e y de dois pontos no plano carteziano
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite as coordenadas do primeiro ponto: ");
		System.out.println("Coordena de X: ");
		double x1 = scan.nextDouble();
		System.out.println("Coordena de Y: ");
		double y1 = scan.nextDouble();
		
		System.out.println("Digite as coordenadas do segundo ponto:");
		System.out.println("Coordena de X: ");
		double x2 = scan.nextDouble();
		System.out.println("Coordena de Y: ");
		double y2 = scan.nextDouble();
		
		double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.println("\nA distância entre os pontos é: " + distancia);
		
		scan.close();

	}

}
