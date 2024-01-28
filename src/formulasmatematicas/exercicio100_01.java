package formulasmatematicas;

import java.util.Scanner;

public class exercicio100_01 {

	public static void main(String[] args) {
		// Calculadora
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		double primeiroNumero = scan.nextInt();
		
		System.out.println("Informe o segundo número: ");
		double segundoNumero = scan.nextInt();
		
		double soma = primeiroNumero + segundoNumero;
		double subt = primeiroNumero - segundoNumero;
		double mult = primeiroNumero * segundoNumero;
		double divi = primeiroNumero / segundoNumero;
		
		System.out.println("A soma dos números informados é: " + soma);
		System.out.println("A subtração dos números informado é: " + subt);
		System.out.println("A multiplicação dos números informados é: " + mult);
		System.out.println("A divisão dos números informados é: " + divi);
		
		scan.close();
		
	}

}
