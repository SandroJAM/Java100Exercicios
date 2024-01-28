package strings;

import java.util.Scanner;

public class exercicio100_23 {

	public static void main(String[] args) {
		// Imprimir a quantidade de espaços em branco de uma frase
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma frase qualquer: ");
		String frase = scan.nextLine();
		
		int contadorDeEspacos = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			
			//Verificar se o caractere atual é um espaço em branco
			if (frase.charAt(i) == ' ') {
				contadorDeEspacos++;
			}
		}
		
		System.out.println("A quantidade de espaços na frase digitada é: " + contadorDeEspacos);
		
		scan.close();

	}

}
