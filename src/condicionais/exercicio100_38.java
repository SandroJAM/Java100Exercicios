package condicionais;

import java.util.Scanner;

public class exercicio100_38 {

	public static void main(String[] args) {
		// Ler o ano de nascimento de uma pessoa e informar se a mesma está apta a votar.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a data de nascimento: ");
		int anoNascimento = scan.nextInt();
		
		int anoAtual = java.time.Year.now().getValue();
		int idade = anoAtual - anoNascimento;
		
		if (idade >= 18) {
			System.out.println("A pessoa está APTA a VOTAR!");
		} else {
			System.out.println("A pessoa Não está APTA a VOTAR!");
		}
		
		scan.close();

	}

}
