package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_64 {

	public static void main(String[] args) {
		// Ler uma frase e exibir a quantidade de vogais nessa frase!
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String frase = input.nextLine();
		
		int contadorVogais = 0;
		
		for (int i = 0; i <frase.length(); i++) {
			char caractere = frase.charAt(i);
			if (caractere == 'a' ||
			    caractere == 'e' ||
			    caractere == 'i' ||
			    caractere == 'o' ||
			    caractere == 'u') {
			    	contadorVogais++;
			    }
		}
		
		System.out.println("A frase possui " + contadorVogais + " vogais!");
		
		input.close();
	}
}