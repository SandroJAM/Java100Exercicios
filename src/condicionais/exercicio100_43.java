package condicionais;

import java.util.Scanner;

public class exercicio100_43 {

	public static void main(String[] args) {
		// Solicitar um númeor inteiro e vrificar e o mesmo é divisível por 3 e 5 ao mesmo tempo.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número INTEIRO: ");
		int numInteiro = scan.nextInt();
		
		if (numInteiro % 3 == 0 && numInteiro % 5 == 0) {
			System.out.println("O número informado é divisível por 3 e por 5!");
		} else {
			System.out.println("O número informado não é divisível por 3 e por 5!");
		}
		
		scan.close();

	}

}