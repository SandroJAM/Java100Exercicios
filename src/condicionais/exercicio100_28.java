package condicionais;

import java.util.Scanner;

public class exercicio100_28 {

	public static void main(String[] args) {
		// Ler três número e exibir o maior deles
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Informe o segundo número: ");
		int numero2 = scan.nextInt();
		
		System.out.println("Informe o terceiro número: ");
		int numero3 = scan.nextInt();
		
		int maior = numero1;
		
		if (numero2 > maior) {
			maior = numero2;
		}
		
		if (numero3 > maior) {
			maior = numero3;
		}
		
		System.out.println("O maior número é: " + maior);
		
		scan.close();

	}

}
