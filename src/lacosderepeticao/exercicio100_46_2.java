package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_46_2 {

	public static void main(String[] args) {
		// Exibir os números de um a dez usando o laço FOR.
		
		Scanner scan = new Scanner(System.in);
		
		for (int contador = 1; contador <= 10; contador++) {
			System.out.println(contador);
		}
		scan.close();
	}

}