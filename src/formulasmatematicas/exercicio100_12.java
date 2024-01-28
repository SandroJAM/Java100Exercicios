package formulasmatematicas;

import java.util.Scanner;

public class exercicio100_12 {

	public static void main(String[] args) {
		// Calcular a energia cinética

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a massa do objeto: ");
		double massa = scan.nextDouble();
		
		System.out.println("Digite a velocidade do objeto: ");
		double velocidade = scan.nextDouble();
		
		double energiaCinetica = (massa * Math.pow(velocidade, 2)) / 2;
		
		System.out.println("A enercia cinética do objeto é: " +energiaCinetica);
		
		scan.close();
		
	}

}
