package condicionais;

import java.util.Scanner;

public class exercicio100_34 {

	public static void main(String[] args) {
		// Ler três números, somar e ver ser essa soma é positiva ou negativa.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		int num1 = scan.nextInt();
		System.out.println("Informeo segundo número: ");
		int num2 = scan.nextInt();
		System.out.println("Informe o terceiro númeoro: ");
		int num3 = scan.nextInt();
		
		int soma = num1 + num2 + num3;
		
		if (soma > 0){
			System.out.println("A SOMA dos números é POSITIVA!");
		} else if (soma < 0) {
			System.out.println("A SOAM dos números é NEGATIVA!");
		} else {
			System.out.println("A SOMA é igual a ZERO!");
		}
		
		scan.close();

	}

}
