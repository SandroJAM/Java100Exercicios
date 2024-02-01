package vetores;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio100_71_2 {

	public static void main(String[] args) {
		// Lista de números inteiros com ArrayList
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de elementos: ");
		int qtdeElementos = entrada.nextInt();
		
		ArrayList<Integer> lista = new ArrayList<>();
		
		System.out.println("Digite os elementos da lista");
		for (int i = 0; i < qtdeElementos; i++) {
			lista.add(entrada.nextInt());
		}
		
		int soma = 0;
		for (int numero : lista) {
			soma += numero;
		}
		System.out.println("A soma dos elementos é: " + soma);
	    entrada.close();
	}
}