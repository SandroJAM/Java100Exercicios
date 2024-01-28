package formulasmatematicas;

import java.util.Scanner;

public class exercicio100_08 {

	public static void main(String[] args) {
		// Calçular o Delta de uma equação de segundo grau
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		double a = scan.nextDouble();
		
		System.out.println("Digite o valor de b: ");
		double b = scan.nextDouble();
		
		System.out.println("Digite o valor de c: ");
		double c = scan.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		System.out.println("O Delta da equação é: " + delta);
		
		scan.close();

	}

}
