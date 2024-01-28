package strings;

import java.util.Scanner;

public class exercicio100_18_2 {

	public static void main(String[] args) {
		// Versão 2 - Receber uma frase e trocar todas as letras (a) por (e) usando laço FOR
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String frase = scan.nextLine();
		
		String novaFrase = "";
		
		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			
			if (letra == 'a') {
				novaFrase += 'e';
			} else {
				novaFrase += letra;
			}
		}
		
		System.out.println("Frase modificada: " + novaFrase);
		
		scan.close();
	}

}
