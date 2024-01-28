package strings;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio100_21 {

	public static void main(String[] args) {
		// Verificar se duas palavras são Anagrama
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira palavra: ");
		String palavra1 = scan.nextLine();
		System.out.println("Digite a segunda palavra: ");
		String palavra2 = scan.nextLine();
		
		// Remove os espaços em branco e convertermos para letras maiúsculas
		
		palavra1 = palavra1.replaceAll("\\s+", "").toLowerCase();
		palavra2 = palavra2.replaceAll("\\s+", "").toLowerCase();
		
		// Verificar se as palavras têm o mesmo tamanho
		
		if (palavra1.length() != palavra2.length()) {
			System.out.println("A segunda palavra não é um anagrama da primeira");
		} else {
			// Convertemos as palavras para array
			char[] arr1 = palavra1.toCharArray();
			char[] arr2 = palavra2.toCharArray();
			// Ordenamos os arrays de caracteres
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			// Verificamos se os arrays ordenados são iguais
			if (Arrays.equals(arr1, arr2)) {
				System.out.println("A segunda palavra é uma anagrama da primeira palavra!");
			} else {
				System.out.println("A segunda palavra não é uma anagrama da primeira palavra!");
			}
		}
        scan.close();
	}
}