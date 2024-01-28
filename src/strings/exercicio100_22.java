package strings;

import java.util.Scanner;

public class exercicio100_22 {

	public static void main(String[] args) {
		// Receber um nome completo e só imprimir o primeiro nome
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um nome completo: ");
		String nomeCompleto = scan.nextLine();
		
		// Dividir o nome completo em partes sepadas pelo espaço em branco
		
		String[] partesNome = nomeCompleto.split(" ");
		
		// Obter primeiro nome
		
		String primeiroNome = partesNome[0];
		
		System.out.println("O primeiro nome é: " + primeiroNome);
		System.out.println("O primeiro nome é: " + partesNome[3]);		
		scan.close();

	}

}