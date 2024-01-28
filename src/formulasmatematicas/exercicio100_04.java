package formulasmatematicas;

import java.util.Scanner;

public class exercicio100_04 {

	public static void main(String[] args) {
		// Média geométrica
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o oprimeiro número: ");
		double numero1 = scan.nextDouble();
		System.out.println("Digite o segund número: ");
		double numero2 = scan.nextDouble();
		System.out.println("Digite o terceiro número: ");
		double numero3 = scan.nextDouble();
		
		double mediaGeometrica = Math.pow(numero1 * numero2 * numero3, 1.0/3.0);
		
		System.out.println("A média geométrica dos números é: " + mediaGeometrica);
		
		scan.close();
		
	}

}
