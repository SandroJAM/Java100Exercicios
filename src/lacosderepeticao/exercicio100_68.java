package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_68 {

	public static void main(String[] args) {
		// Determinar o MMC (meno Multiplo Comum) dos números informados!
		
		Scanner input = new Scanner(System.in);
		
			System.out.println("Digite o primeiro número: ");
			int numero1 = input.nextInt();
			System.out.println("Digite o segundo número: ");
			int numero2 = input.nextInt();
		
			int maiorNumero = Math.max(numero1, numero2);
			int mmc = maiorNumero;
		
			while(mmc % numero1 != 0 || mmc % numero2 != 0) {
				mmc += maiorNumero;
			}
			
		System.out.println("O MMC de " + numero1 + " e " + numero2 + " é: " + mmc);
			
		input.close();
	}
}