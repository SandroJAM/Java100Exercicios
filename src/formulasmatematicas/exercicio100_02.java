package formulasmatematicas;

import java.util.Scanner;

public class exercicio100_02 {

	public static void main(String[] args) {
		// Média aritmética de duas notas
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double numero1 = scan.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double numero2 = scan.nextDouble();
		
		double media = (numero1 + numero2) / 2;
		
		System.out.println("A média dos números é: " + media);
		
		scan.close();
		
	}

}
