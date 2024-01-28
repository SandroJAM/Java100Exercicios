package strings;

import java.util.Scanner;

public class exercicio100_23_2 {

	public static void main(String[] args) {
		// Imprimir a quantidade de espaços em branco de uma frase, sem utilizar laço FOR 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String frase = scan.nextLine();
		
		// Dividir a frase em partes separadas pelos espaço em branco
		String[] partes = frase.split(" ");
		
		// Calcular a quantidade de espaços em branco
		int qtdeDeEspacos = partes.length -1;
		
		System.out.println("A quantidade de espaços na frase é " + qtdeDeEspacos);
		
		scan.close();		

	}

}