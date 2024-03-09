package funcoesrecursivas;

public class exercicio100_99 {

	public static void main(String[] args) {
		// Função Recursiva para determinar se uma palavra é um palindromo;
		// Palíndromos são frases ou palavras que podem ser lidas, indiferentemente,
		// da esquerda para a direita

		String palavra = "radar";
		boolean resultado = verificarPalindromo(palavra);
		System.out.println("A palavra '" + palavra + "' é um palíndromo? " + resultado);
	}

	public static boolean verificarPalindromo(String palavra) {
		if (palavra.length() <= 1) {
			return true;
		} else {
			char primeiro = palavra.charAt(0);
			char ultimo = palavra.charAt(palavra.length() - 1);
			if (primeiro == ultimo) {
				String subPalavra = palavra.substring(1, palavra.length() - 1);
				return verificarPalindromo(subPalavra);
			} else {
				return false;
			}
		}
	}

}