package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_65 {

	public static void main(String[] args) {
		// Ler uma frase e exibir a frase de trás para frente!
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma frase qualquer: ");
		String frase = input.nextLine();
		
		String fraseReversa = "";
		
		for (int i = frase.length() - 1; i >= 0; i--) {
			fraseReversa += frase.charAt(i);
		}
		System.out.println("Frase de trás para frente: " + fraseReversa);
		input.close();
	}

}
