package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_61 {

	public static void main(String[] args) {
		// Ler um número e exibir a sequência de Fibonnacci até o núemro informado, utilizando um laço!
		
		// A sequência de Fibonacci é uma sequência numérica em que cada termo a partir do terceiro é a soma dos dois antecessores.
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = input.nextInt();
		
		System.out.print("A sequência de Fibonacci até " + numero + ":");
		
		int primeiroTermo = 0;
		int segundoTermo = 1;
		
		while (primeiroTermo <= numero) {
			
			System.out.print(primeiroTermo + " ");
			
			int proximoTermo = primeiroTermo + segundoTermo;
			primeiroTermo = segundoTermo;
			segundoTermo = proximoTermo;
		}
		
		input.close();
	}
}