package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_66 {

	public static void main(String[] args) {
		// Ler uma sequência de caracteres e indicar se a mesma é um palíndromo!
		
		// Palíndromo, segundo o dicionário Houaiss, “diz-se de ou frase ou palavra que se pode ler, indiferentemente,
		// da esquerda para direita ou vice-versa”: osso, Ana, radar, Renner, Roma é amo
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma sequência de CARACTERES: ");
		String sequencia = input.nextLine();
		int i = 0;
		int j = sequencia.length() - 1;
		boolean ePalindromo = true;
		
		while (i < j) {
			if (sequencia.charAt(i) != sequencia.charAt(j)) {
				ePalindromo = false;
			}
			i++;
			j--;
		}
		
	    if (ePalindromo) {
	    	System.out.println("A sequência é um PALÍNDROMO!");
	    } else {
	    	System.out.println("A sequência NÃO é um PALÍNDROMO!");
	    }
		
		input.close();
	}
}