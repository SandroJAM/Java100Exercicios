package funcoesrecursivas;

public class exercicio100_91 {

	public static void main(String[] args) {
		// Escrever uma função recursiva para calcular o fatorial de um número;

		int numero = 5;
		long resultado = calcularFatorial(numero);
		System.out.println("o fatorial de " + numero + " é: " + resultado);
	}
	
	public static long calcularFatorial(int numero) {
		if(numero == 0) {
			return 1;
		} else {
			return numero * calcularFatorial(numero - 1);
		}
	}

}