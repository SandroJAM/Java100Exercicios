package strings;

import java.util.Scanner;

public class exercicio100_24 {

	public static void main(String[] args) {
		// Criar uma palavra e exiber a quantidade  de vogais presente na mesma
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = scan.nextLine();
		
		int contadorDeVogais = 0;
		
		// Percorrer cada caractere da palavra
		
		for (int i=0; i < palavra.length(); i++) {
			char letra = Character.toLowerCase(palavra.charAt(i));
			
			// Verifica se a letra é vogal

			if (letra == 'a' ||
			   letra == 'e' ||
			   letra == 'i' ||
			   letra == 'o' ||
			   letra == 'u'){
					 contadorDeVogais++;
			   }
		}
		
		System.out.println("A quantidade de vogais é: " + contadorDeVogais);
		scan.close();

	}

}