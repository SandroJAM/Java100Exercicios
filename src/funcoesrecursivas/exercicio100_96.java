package funcoesrecursivas;

public class exercicio100_96 {

	public static void main(String[] args) {
		// Função Recursiva para encontrar o MDC - Máximo Divisor Comum de dois números;
		int numero1 = 36;
		int numero2 = 48;
		int mdc = calcularMDC(numero1, numero2);
		System.out.println("O MDC de " + numero1 + " e " + numero2 + " é " + mdc);
	}

	public static int calcularMDC(int numero1, int numero2) {
		if(numero2 == 0) {
			return numero1;
		} else {
			return calcularMDC(numero2, numero1 % numero2);
		}
	}
}