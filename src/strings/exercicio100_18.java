package strings;

import java.util.Scanner;

public class exercicio100_18 {

	public static void main(String[] args) {
		// Receber uma frase e trocar todas as letras (a) por (e)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String frase = scan.nextLine();
		
		String novaFrase = frase.replace('a', 'e');
		
		System.out.println("A frase modificada: " + novaFrase);
		
		scan.close();

	}

}