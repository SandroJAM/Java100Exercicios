package formulasmatematicas;

import java.util.Scanner;

public class exercicio100_06 {

	public static void main(String[] args) {
		// Calculadr o perímetro de um círculo
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o raio do círculo: ");
		double raio = scan.nextDouble();
		
		double perimetro = 2 * Math.PI * raio; /* Valor da constante PI é aproximadamente 3.14159 */
		
		System.out.println("O perímetro do círculo é: " + perimetro);
		
		scan.close();
		
	}

}
