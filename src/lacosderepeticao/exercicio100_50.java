package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_50 {

	public static void main(String[] args) {
		// Ler um número e exibir a tabuada desse número utilizando laço de repetição!
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int numero = scan.nextInt();
		for (int contador = 1; contador <= 10; contador++) {
			int resultado = numero * 1;
			System.out.println(numero + " x " + contador + " = " + resultado);
		}
		scan.close();
	}
}