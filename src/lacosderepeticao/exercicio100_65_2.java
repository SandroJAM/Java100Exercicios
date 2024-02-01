package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_65_2 {

	public static void main(String[] args) {
		// Outra forma de fazer a frase reversa sem laço FOR!
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String frase = input.nextLine();
		
		String fraseReversa = new StringBuilder(frase).reverse().toString();
		System.out.println("A frase de trás para frente: " + fraseReversa);
		input.close();
	}
}