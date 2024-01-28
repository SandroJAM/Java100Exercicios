package formulasmatematicas;

import java.util.Scanner;

public class exercicio100_05 {

	public static void main(String[] args) {
		// Calculadora IMC
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Diite o peso em quilogramas: ");
		double peso = scan.nextDouble();
		System.out.println("Digite a altura em metros: ");
		double altura = scan.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println("O IMC é: " + imc);
		
		scan.close();
		
	}

}
