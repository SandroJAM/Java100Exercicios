package condicionais;

import java.util.Scanner;

public class exercicio100_36 {

	public static void main(String[] args) {
		// Ler a idade de três pessoas e exibir quantas são maior de idade;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a idade da primeira pessoa: ");
		int priIdade = scan.nextInt();
		System.out.println("Informe a idade da segunda pessoa: ");
		int segIdade = scan.nextInt();
		System.out.println("Informe a idade da terceira pessoa: ");
		int terIdade = scan.nextInt();
		
		int contarMaioresIdade = 0;
		
		if (priIdade >= 18) {
			contarMaioresIdade++;
		}
		if (segIdade >= 18) {
			contarMaioresIdade++;
		}
		if (terIdade >= 18) {
			contarMaioresIdade++;
		}
		
		System.out.println("Quantidade de pessoas maiores de idade é: " + contarMaioresIdade);
		
		scan.close();

	}

}
