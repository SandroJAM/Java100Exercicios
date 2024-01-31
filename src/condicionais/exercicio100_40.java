package condicionais;

import java.util.Scanner;

public class exercicio100_40 {

	public static void main(String[] args) {
		// Ler três notas, calcular a media e exibir resultado aprovado ou não aprovado.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("Informe a segunda nota: ");
		double nota2 = scan.nextDouble();
		System.out.println("informa a terceira nota: ");
		double nota3 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		if (media >= 7) {
			System.out.println("Aluno APROVADO!");
		} else if (media < 4) {
			System.out.println("Aluno REPROVADO!");
		} else {
			System.out.println("Aluno em RECUPERAÇÂO!");
		}
		
		scan.close();
	}

}
