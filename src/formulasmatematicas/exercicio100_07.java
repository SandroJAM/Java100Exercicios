package formulasmatematicas;

import java.util.Scanner;

public class exercicio100_07 {

	public static void main(String[] args) {
		// Area do círculo utilizando a formula A = PIr2
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o raio do círculo: ");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do círculo é: " + area);
		
		scan.close();

	}

}
