package strings;

import java.util.Scanner;

public class exercicio100_17_2 {

	public static void main(String[] args) {
		// Versão 2 - Receber uma palavra e exibir cada letra separadamente usando laço FOR
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = scan.nextLine();
		
		// Converter a palavra para um array de caracteres
		char[] letras = palavra.toCharArray();
		
		// Percorremos o array e exibimos cada letra separadamente
		for (char letra : letras) {
			System.out.println(letra);
		}
		
		scan.close();
		
	}

}
