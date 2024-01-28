package strings;

import java.util.Scanner;

public class exercicio100_17 {

	public static void main(String[] args) {
			// Receber uma palavra e exibir cada letra separadamente usando laço FOR
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Informe uma palavra: ");
			String palavra = scan.nextLine();
			
			for (int i = 0; i < palavra.length(); i++) {
				char letra = palavra.charAt(i);
				System.out.println(letra);
			}
			
			scan.close();

	}

}
