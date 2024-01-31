package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_46 {

	public static void main(String[] args) {
		// Exibir os números de um a dez usando o laço WHILE
		
		Scanner scan = new Scanner(System.in);
		
		int contador = 1;
		
		while ( contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		
		scan.close();

	}

}