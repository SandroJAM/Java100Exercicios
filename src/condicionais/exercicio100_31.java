package condicionais;

import java.util.Scanner;

public class exercicio100_31 {

	public static void main(String[] args) {
		// Ler duas provas e informar se o aluno foi aprovado.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota da prova: ");
		int primeiraNota = scan.nextInt();
		System.out.println("Digite a segunda nota da prova: ");
		int segundaNota = scan.nextInt();
		
		if (primeiraNota >= 6) {
			System.out.println("Aluno APROVADO na primeira nota!");
		} else {
			System.out.println("Aluno REPROVADO na primeira nota!");
		}
		
		if (segundaNota >=6) {
			System.out.println("Aluno APROVADO na segunda nota!");
		} else {
			System.out.println("Aluno REPROVADO na segunda nota!");
		}
		
		scan.close();

	}

}
