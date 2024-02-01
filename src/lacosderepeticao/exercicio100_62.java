package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_62 {

	public static void main(String[] args) {
		// Ler vários números e exibir a média dos números digitados!
		
		Scanner input = new Scanner(System.in);
		
		int soma = 0;
		int contador = 0;
		
		System.out.println("Digite números  (Digite 0 para sair): ");
		
		while (true) {
	    	int numero = input.nextInt();
		
		    if (numero == 00) {
			    break;
	    	}
		    
		    soma += numero;
		    contador++;
    	}
		
		if (contador != 0) {
			double media = (double) soma / contador;
			System.out.println("A média dos números digitados é: " + media);
		} else {
			System.out.println("Nenhum número foi digitado!");
		}
		
		input.close();
	}
}