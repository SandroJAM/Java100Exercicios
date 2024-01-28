package formulasmatematicas;

import java.util.Scanner;

public class exercicio100_09 {

	public static void main(String[] args) {
		// Calcular o perímetro e a área de um retângulo
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a largura do retângulo: ");
		double largura = scan.nextDouble();
		
		System.out.println("Digite o comprimento do retângulo: ");
		double comprimento = scan.nextDouble();
		
		double perimetro = 2 * (largura + comprimento);
		double area = largura * comprimento;
		
		System.out.println("O perímetro do retângulo é: " + perimetro);
		System.out.println("A área do retângulo é: " + area);
		
		scan.close();

	}

}
