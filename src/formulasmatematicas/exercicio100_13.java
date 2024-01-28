package formulasmatematicas;

import java.util.Scanner;

public class exercicio100_13 {

	public static void main(String[] args) {
		// Calcular  o trabalho realizado por uma força
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a força aplicada: ");
		double forca = scan.nextDouble();
		
		System.out.println("Digite a distância percorrida: ");
		double distancia = scan.nextDouble();
		
		double trabalho = forca * distancia;
		
		System.out.println("O trabalaho realizado é: " + trabalho);
		
		scan.close();

	}

}
