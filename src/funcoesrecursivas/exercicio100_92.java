package funcoesrecursivas;

public class exercicio100_92 {

	public static void main(String[] args) {
		// Função Recursiva que calcula a sequência de Fibonacci até um determinado
		// número;
		int limite = 50;
		System.out.println("Sequência de Fibonacci até " + limite + ":");
		for (int i = 0; i <= limite; i++) {
			System.out.println(calcularFibonacci(i) + " ");
		}

	}

	private static int calcularFibonacci(int numero) {
		// Método Calcular Fibonacci;
		if (numero <= 1) {
			return numero;
		} else {
			return calcularFibonacci(numero - 1) + calcularFibonacci(numero - 2);
		}
	}
}