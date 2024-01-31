package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_54 {

	public static void main(String[] args) {
		// Calcular o valor da potência de um número e uma potência informados pelo usuário! 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número BASE: ");
		int  base = input.nextInt();
		System.out.println("Digite o EXPOENTE: ");
		int expoente = input.nextInt();
		
		int resultado = 1;
		
		for( int i = 1; i <= expoente; i++) {
			resultado *= base;
		}
		System.out.println(base + " elevado a " + " é " + resultado);
		input.close();
	}
}