package condicionais;

import java.util.Scanner;

public class exercicio100_33 {

	public static void main(String[] args) {
		// Ler três número e informar se a soma de ambos é divisível por 5
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numero1 = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		int numero2 = scan.nextInt();
		System.out.println("Digite o terceiro número: ");
		int numero3 = scan.nextInt();
		
		int somarNum = numero1 + numero2 + numero3;
		
		if (somarNum % 5 == 0) {
			System.out.println("A soma dos números é divisível por 5!");
		} else {
			System.out.println("A soma dos números não é divisível por 5!");
		}
		
		scan.close();

	}

}
