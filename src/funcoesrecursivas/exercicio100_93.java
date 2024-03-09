package funcoesrecursivas;

public class exercicio100_93 {

	public static void main(String[] args) {
		// Função Recursiva para verificar se o número é PRIMO;
		// m número primo é aquele que é dividido apenas por um e por ele mesmo.
		// Entre 0 e 100 existem apenas 25 números primos.

		int numero = 17;
		if (verificarPrimo(numero)) {
			System.out.println(numero + " é um número PRIMO!");
		} else {
			System.out.println(numero + " não é um número PRIMO!");
		}
	}

	public static boolean verificarPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}
		return verificarPrimoRecursivo(numero, 2);
	}

	public static boolean verificarPrimoRecursivo(int numero, int divisor) {
		if (divisor == numero) {
			return true;
		}

		if (numero % divisor == 0) {
			return false;
		}

		return verificarPrimoRecursivo(numero, divisor + 1);
	}

}