package condicionais;

import java.util.Scanner;

public class exercicio100_37 {

	public static void main(String[] args) {
		// Ler três números e informar se podem ser lados de um triângulo!
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro lado do TRIÂNGULO: ");
		double lado1 = scan.nextDouble();
		System.out.println("Informe o segundo lado do TRIÂNGULO: ");
		double lado2 = scan.nextDouble();
		System.out.println("Informe a terceiro lado do TRIÂNGULO");
		double lado3 = scan.nextDouble();
		
		boolean podeFormarTriangulo = (lado1 + lado2 > lado3)
				&& (lado1 + lado3 > lado2)
				&& (lado2 + lado3 > lado1);
		
		if (podeFormarTriangulo){
			System.out.println("Os números podem ser os lado de um TRIÂNGULO!");
		} else {
			System.out.println("Os números não podem ser os lados de um TRIÂNGULO!");
		}
		
		scan.close();

	}

}