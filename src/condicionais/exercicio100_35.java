package condicionais;

import java.util.Scanner;

public class exercicio100_35 {

	public static void main(String[] args) {
		// Ler três números e mostra na tela em ordem crescente!
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numero1 = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		int numero2 = scan.nextInt();
		System.out.println("Digite o terceiro número: ");
		int numero3 = scan.nextInt();
		
		if (numero1 <= numero2 && numero1 <= numero3) {
			System.out.print(numero1 + " ");
			if (numero2 <= numero3){
				System.out.println(numero2 + " " + numero3);
			} else {
				System.out.println(numero3 + " " + numero2);
			}
		} else if (numero2 <= numero1 && numero2 <+ numero3){
			System.out.print(numero2 + " ");
			if (numero1 <= numero3){
				System.out.println(numero1 + " " + numero3);
			} else {
				System.out.println(numero3 + " " + numero1);
			}
		} else {
			System.out.print(numero3 + " ");
			if (numero1 <= numero2) {
				System.out.println(numero1 + " " + numero2);
			} else {
				System.out.println(numero2 + " " + numero1);
			}
		}
		
		scan.close();
		
	}

}