package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_52 {

	public static void main(String[] args) {
		// Ler um número e exibir a soma de todos os números a N.
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scan.nextInt();
		int soma = 0;
		for (int i = 1; i <= numero; i++) {
			soma += i;	
		}
		
		System.out.println("A SOMA dos números de 1 a " + numero + " é: " + soma);
		scan.close();
	}
}