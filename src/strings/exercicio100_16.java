package strings;

import java.util.Scanner;

public class exercicio100_16 {

	public static void main(String[] args) {
		// Ler duas palavras e concatenar exibindo o resultado
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira palavra: ");
		String primeiraPalavra = scan.nextLine();
		System.out.println("Digite a segunda Palavra: ");
		String segundaPalavra = scan.nextLine();
		
		String resultadoConcatenado = primeiraPalavra + segundaPalavra;
		
		System.out.println("A palavra resultante da concatenação é: " + resultadoConcatenado);
		
		scan.close();

	}

}
