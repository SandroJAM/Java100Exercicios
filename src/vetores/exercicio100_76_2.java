package vetores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicio100_76_2 {

	public static void main(String[] args) {
		// Outra forma de fazer o exercico 76
		
		Scanner entrada = new Scanner(System.in);
		
		// Pedimos ao usuário para digitar o tamanho do VETOR;
		System.out.println("Digite o tamanho do VETOR: ");
		int tamanho = entrada.nextInt();
		
		// Criamos um ArryList chamado VETOR para armazenar os elementos do VETOR;
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		
		// Solicitamos que o usuário digite os elementos do VETOR usando um loop for;
		
		System.out.println("Digite os elementos do VETOR: ");
		for (int i = 0; i < tamanho; i++) {
			vetor.add(entrada.nextInt());
		}
		
		// Utilizamos o método reverse da classe collections para inverter o VETOR;
		Collections.reverse(vetor);
		
	    System.out.println("Elementos do VETOR na ordem inversa: ");
	    // por fim exibimos o VETOR invertido e exibimos seus elementos na ordem inversa;
	    for (int elemento : vetor) {
	    	System.out.print(elemento + " ");
	    }
		
		entrada.close();

	}

}