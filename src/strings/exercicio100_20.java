package strings;

import java.util.Scanner;

public class exercicio100_20 {

	public static void main(String[] args) {
		// verificar se a palavra é palíndromo
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = scan.nextLine();
		
		// Removemos os espaços em branco e convertemos para letras maiúsculas
		
		String palavraFormatada = palavra.replaceAll("\\s+", "").toLowerCase();
		boolean palindromo = true;
		
		// Percorremos a palavra verificando se os caracteres coincidem
		
		for (int i = 0; i <palavraFormatada.length() / 2; i++) {
			char a = palavraFormatada.charAt(i);
			char b = palavraFormatada.charAt(palavraFormatada.length() -i -1);
			if (a != b) {
				palindromo = false;
				break;
			}
		}
		if (palindromo) {
			System.out.println("A palavra É um Palíndromo!");
		} else {
			System.out.println("A palavra NÃO É um Palíndromo");
		}
		
		scan.close();

	}

}
