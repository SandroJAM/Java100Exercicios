package funcoesrecursivas;

public class exercicio100_98 {

	public static void main(String[] args) {
		// Função Recursiva para encontrar valor em um vetor;

		int[] vetor = { 5, 2, 9, 4, 7 };
		int menorValor = encontrarMenorValor(vetor);
		System.out.println("menor Valor: " + menorValor);
	}

	public static int encontrarMenorValor(int[] vetor) {
		return encontrarMenorValorRecursivo(vetor, 0, vetor.length - 1);
	}

	public static int encontrarMenorValorRecursivo(int[] vetor, int inicio, int fim) {
		if (inicio == fim) {
			return vetor[inicio];
		} else {
			int meio = (inicio + fim) / 2;
			int menorEsquerda = encontrarMenorValorRecursivo(vetor, inicio, meio);
			int menorDireita = encontrarMenorValorRecursivo(vetor, meio + 1, fim);
			return Math.min(menorEsquerda, menorDireita);
		}
	}
}