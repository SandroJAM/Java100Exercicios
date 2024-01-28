package condicionais;

import java.util.Scanner;

public class exercicio100_26 {

	public static void main(String[] args) {
		// Solicitar a idade e ver se é maior de idade ou não
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("Você é maior de idade!");
		} else {
			System.out.println("Você é menor de idade");
		}
		
		scan.close();

	}

}
