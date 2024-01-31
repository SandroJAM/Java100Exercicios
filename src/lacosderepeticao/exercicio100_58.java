package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_58 {

	public static void main(String[] args) {
		// Ler um número e exibeir o primeiros quadrados perfeitos!
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de quadrados perfeitos desejadas: ");
		int quantidade = scan.nextInt();
		
		System.out.println("Os primeiros " + quantidade + " quadrados são: ");
		
		int numero = 1;
		int contador = 0;
		
		while (contador < quantidade) {
			int raiz = (int) Math.sqrt(numero);
			if (raiz * raiz == numero) {
				System.out.print(numero + " ");
				contador++;
			}
		}
		scan.close();
	}
}