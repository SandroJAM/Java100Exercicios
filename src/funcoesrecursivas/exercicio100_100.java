package funcoesrecursivas;

public class exercicio100_100 {

	public static void main(String[] args) {
		// Função Recursiva para calcular a soma dos elementos de um vetor;
		
		int[] vetor = {1, 2, 3, 4, 5};
		int resultado = calcularSomaVetor(vetor, vetor.length - 1);
		System.out.println("A soma dos elementos do vetor é: " + resultado);
	}

	public static int calcularSomaVetor(int[] vetor, int indice) {
		if(indice < 0) {
			return 0;
		} else {
			return vetor[indice] + calcularSomaVetor(vetor, indice -1);
		}
	}
	
}