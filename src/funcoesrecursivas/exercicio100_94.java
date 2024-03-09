package funcoesrecursivas;

public class exercicio100_94 {

	public static void main(String[] args) {
		// Função Recrusiva que calcula a soma do dígitos de um número inteiro;

		int numero = 12345;
		int soma = calcularSomaDigitos(numero);
		System.out.println("A SOMA dos DÍGITOS de " + numero + " é: " + soma);
	}

	public static int calcularSomaDigitos(int numero) {
		if (numero < 10) {
			return numero;
		} else {
			return numero % 10 + calcularSomaDigitos(numero / 10);
		}
	}

}