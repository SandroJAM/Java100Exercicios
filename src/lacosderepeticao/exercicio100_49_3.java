package lacosderepeticao;

public class exercicio100_49_3 {

	public static void main(String[] args) {
		// Escrever um código que imprima os números ÌMPARES de 1 a 50 usando FOR!
		System.out.println("\nNúmero Ímpares\n");
		for (int contador = 1; contador <= 50; contador++) {
			if (contador % 2 != 0) {
				System.out.println(contador);
			}
		}
	}
}