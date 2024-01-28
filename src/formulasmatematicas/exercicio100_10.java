package formulasmatematicas;

import java.util.Scanner;

public class exercicio100_10 {

	public static void main(String[] args) {
		// Calcular o perímetro do triângulo
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o lado A do triângulo: ");
		double ladoA = scan.nextDouble();
		System.out.println("Digite o lado B do triângulo: ");
		double ladoB = scan.nextDouble();
		System.out.println("Digite o lado C do triângulo: ");
		double ladoC = scan.nextDouble();
		
		System.out.println("Digite a altura H relativa ao lado B do triângulo: ");
		double altura = scan.nextDouble();
		
		double perimetro = ladoA + ladoB + ladoC;
		double area = (ladoB * altura) / 2;
		
		System.out.println("O perímetro do triângulo é: " + perimetro);
		System.out.println("A área do triângulo é: " + area);
		
		scan.close();
		
	}

}
