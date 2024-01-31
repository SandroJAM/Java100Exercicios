package condicionais;

import java.util.Scanner;

public class exercicio100_45 {

	public static void main(String[] args) {
		// Ler dois número e ver se o primeiro é divisível pelo segundo!
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		int numero1 = scan.nextInt();
		System.out.println("Informa o segundo número: ");
		int numero2 = scan.nextInt();
		
		if (numero1 % numero2 == 0) {
			System.out.println(numero1 + " é divisível por " + numero2);
		} else {
			System.out.println(numero1 + " não é divisível por " + numero2);
		}
		
		scan.close();

	}

}