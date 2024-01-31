package condicionais;

import java.util.Scanner;

public class exercicio100_41 {

	public static void main(String[] args) {
		// Informar um dia da semana e exibir se é dia útil ou fim de semana.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um dia da semana: ");
		String diaSemana = scan.next();
		
		if (diaSemana.equalsIgnoreCase("segunda") ||
		   diaSemana.equalsIgnoreCase("terça") ||
		   diaSemana.equalsIgnoreCase("quarta") ||
		   diaSemana.equalsIgnoreCase("quinta") ||
		   diaSemana.equalsIgnoreCase("sexta")){
		   System.out.println(diaSemana + " é um dia útil!");
		} else if (diaSemana.equalsIgnoreCase("sábado") ||
		   diaSemana.equalsIgnoreCase("domingo")){
		System.out.println(diaSemana + " é um fim de semana!");
		} else {
			System.out.println("Dia inválido!");
		}
		
		scan.close();
		
	}

}