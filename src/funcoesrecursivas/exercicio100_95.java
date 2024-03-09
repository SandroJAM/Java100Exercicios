package funcoesrecursivas;

public class exercicio100_95 {

	public static void main(String[] args) {
		// Função Recursiva que calcula a potência de um número inteiro elevado ao
		// expoente;

		int base = 2;
		int expoente = 5;
		int resultado = calcularPotencia(base, expoente);
		System.out.println("Resultado: " + resultado);
	}

	public static int calcularPotencia(int base, int expoente) {
		if (expoente == 0) {
			return 1;
		} else {
			return base * calcularPotencia(base, expoente - 1);
		}
	}
}