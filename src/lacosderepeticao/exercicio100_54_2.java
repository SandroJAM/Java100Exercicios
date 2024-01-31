package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_54_2 {

	public static void main(String[] args) {
		// Calcular o valor da potência de um número e uma potência informados pelo usuário!
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número BASE: ");
		double base = input.nextInt();
		System.out.println("Digite o EXPOENTE: ");
		int expoente = input.nextInt();
		
		double resultado = Math.pow(base, expoente);
		
		System.out.println(base + " elevado a " + expoente + " é " + resultado);
		System.out.printf(base + " elevado a " + expoente + " é " + resultado);
		
		input.close();
		
	}
}