package condicionais;

import java.util.Scanner;

public class exercicio100_39 {

	public static void main(String[] args) {
		// Ler a idade da pessoa, ver se a mesma está apta a votar ou não e se o voto é facultativo
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a idade da pessoal: ");
		int idade = scan.nextInt();
		
		if (idade < 16) {
			System.out.println("A pessoal não está apta a votar!");
		} else if (idade >= 16 && idade <=17 || idade >= 70) {
			System.out.println("A pessoa é apta a votar, porém é facultativo!");
		} else {
			System.out.println("A pessoa é apta a votar e o voto é obrigatório!");
		}
		
		scan.close();

	}

}