package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_48 {

	public static void main(String[] args) {
		// Escrever todos os números PARES de 1 a 100!
		
		Scanner scan = new Scanner(System.in);
		
		int contador = 2;
		
		while (contador <= 100) {
			System.out.println(contador);
			contador += 2;
		}
		
		scan.close();

	}

}
