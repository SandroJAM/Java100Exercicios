package condicionais;

import java.util.Scanner;

public class exercicio100_44 {

	public static void main(String[] args) {
		// Solicitar a idade e exibir em uqal faixa etária a pessoa se encaixa.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a sua idade: ");
		int idade = scan.nextInt();
		
		if (idade >= 0 && idade <= 12) {
			System.out.println("Criança!");
		} else if (idade >= 13 && idade <= 17) {
			System.out.println("Adolescente!");
		} else if (idade >= 18 && idade <= 59) {
			System.out.println("Adulto!");
		} else {
			System.out.println("Idoso!");
		}
		
		scan.close();

	}

}
