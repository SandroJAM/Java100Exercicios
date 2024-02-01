package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_63 {

	public static void main(String[] args) {
		// ler vários números e imprimir o menor e o maior entre eles!
		
		Scanner input = new Scanner(System.in);
		
		int numMaior = Integer.MIN_VALUE;
		int numMenor = Integer.MAX_VALUE;
		
		System.out.println("Digite uma lista de números (Digite 0 para sair): ");
		
		while (true) {
			
			int numero = input.nextInt();
			
			if (numero == 0) {
				break;
			}
			if (numero > numMaior) {
				numMaior = numero;
			}
			if (numero < numMenor) {
				numMenor = numero;
			}
		
		}
		
		if (numMaior == Integer.MIN_VALUE && numMenor == Integer.MAX_VALUE) {
			System.out.println("nenhum número foi digitado!");
		} else {
			System.out.println("O MAIOR número digitado foi: " + numMaior);
			System.out.println("O MENOR número digitado foi: " + numMenor);
		}
		
		input.close();

	}
}