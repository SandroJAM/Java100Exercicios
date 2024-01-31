package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_47 {

	public static void main(String[] args) {
		// Exibir os números de 1 (um) a 100 (cem) com WHILE!
		
		Scanner scan = new Scanner(System.in);
		
		int contador = 0;
		while (contador <= 100) {
			System.out.println(contador);
			contador++;
		}
		
		scan.close();

	}

}
