package formulasmatematicas;

import java.util.Scanner;

public class exercicio100_03 {

	public static void main(String[] args) {
		// Média aritmética de três notas
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira Nota: ");
		double nota1 = scanner.nextDouble();
		System.out.println("Digite a segunda nota:  ");
		double nota2 =  scanner.nextDouble();
		System.out.println("Digite a terceira nota: ");
		double nota3 =  scanner.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		System.out.print("A média das notas é: %.2f" + media);
		
		scanner.close();
		
	}

}
