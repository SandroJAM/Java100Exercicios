package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_56_2 {

	public static void main(String[] args) {
		// Ler um número e exibir todos os número PRIMOS menores que o número lido!
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número INTEIRO: ");
		int numero = input.nextInt();
		
		System.out.print("\nNúmero PRIMOS menores que " + numero + ": ");
						
		for (int i = 2; i < numero; i++) {
			if (isPrimo(i)) {
				System.out.print(i + " ");
			}
		}
		
		input.close();
		
	}
		
	public static boolean isPrimo(int num) {
		if (num <= 1){
			return false;
		}
			
		for(int i = 2; i <= Math.sqrt(num); i++){
			if (num % i == 0) {
				return false;
			}
		}
		return true;
			
	}
 }