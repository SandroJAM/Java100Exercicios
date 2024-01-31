package condicionais;

import java.util.Scanner;

public class exercicio100_32 {

	public static void main(String[] args) {
		// Ler duas notas, calcular a media e checar se o aluno foi aprovado ou não.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a NOTA da primeira PROVA: ");
		double priNota = scan.nextDouble();
		System.out.println("Informe a NOTA da segunda PROVA: ");
		double segNota = scan.nextDouble();
		
		double media = (priNota + segNota) / 2;
		
		if (media <= 6) {
			System.out.println("O aluno foi APROVADO com MÉDIA = " + media);
		} else {
			System.out.println("O aluno foi REPROVADO com MÉDIA = " + media);
		}
		
		scan.close();
		
	}

}
