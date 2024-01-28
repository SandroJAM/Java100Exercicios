package strings;

import java.util.Scanner;

public class exercicio100_25 {

	public static void main(String[] args) {
		// Receber um nome completo e exibir o sobrenome (último nome) primeiro.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um nome completo: ");
		String nomeCompleto = scan.nextLine();
		
		String [] partes = nomeCompleto.split(" ");
		String sobreNome = partes[partes.length -1];
		
		System.out.print("Nome com sobrenome primeiro: ");
		System.out.print(sobreNome);
		
		for (int i = 0; i < partes.length - 1; i++) {
			System.out.print(" " + partes[i]);
		}
		
		System.out.println("");
		
		scan.close();

	}

}
