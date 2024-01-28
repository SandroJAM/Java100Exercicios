package strings;

import java.util.Scanner;

public class exercicio100_19 {

	public static void main(String[] args) {
		// Escrever um nome e verificar se o mesmo começa com a letra A
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um nome: ");
		String nome = scan.nextLine();
		
		// Convertemos o nome para letras minúsculas para facilitara a comparação
		
		String nomeMinusculo = nome.toLowerCase();
		
		if (nomeMinusculo.startsWith("a")) {
			System.out.println("O nome COMEÇA com a letra A.");
		} else {
			System.out.println("O nome NÃO COMEÇA com a letra A.");
		}
		
		scan.close();
		
	}

}
