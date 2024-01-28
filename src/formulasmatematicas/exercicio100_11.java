package formulasmatematicas;

import java.util.Scanner;

public class exercicio100_11 {

	public static void main(String[] args) {
		// Calcular a valocidade média
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a variação do espaço (Deltas): ");
		double variacaoEspaco = scan.nextDouble();
		
		System.out.println("Digite a variação do tempo (Deltat): ");
		double variacaoTempo = scan.nextDouble();
		
		double velocidadeMedia = variacaoEspaco / variacaoTempo;
		
		System.out.println("A velocidade média é: " + velocidadeMedia);
		
		scan.close();
		
	}

}
