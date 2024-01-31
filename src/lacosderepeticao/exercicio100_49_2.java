package lacosderepeticao;

public class exercicio100_49_2 {

	public static void main(String[] args) {
		// Escrever um código que imprima os números ÌMPARES de 1 a 50 usando WHILE!
		System.out.println("\nNúmero Ímpares!\n");
		int i = 1;
		while (i <= 50) {
			if (i % 2 != 0){
			   System.out.println(i);
			}
			i++;
		}
	}
}