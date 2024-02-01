package lacosderepeticao;

import java.util.Scanner;

public class exercicio100_70 {

	public static void main(String[] args) {
		// Ler um CPF e fazer a validação do mesmo!
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o CPF (Somente Números): ");
		String cpf = input.nextLine();
		
		// Remove possíveis caracteres não númericos do CPF
		
		cpf = cpf.replaceAll("\\D", "");
		
		// Verifica se o CPF tem 11 dígitos
		
		if (cpf.length() != 11) {
			System.out.println("CPF inválido!");
		}
		
		// Verifica se todos os dígitos são iguais (CPF ínválido)
		
		if (cpf.matches("{(\\d)\\1{10}")) {
			System.out.println("CPF inválido!");
		}
		
		// Calcular o primeiro dígito verificado
		
		int soma = 0;
		for (int i = 0; i < 9; i++) {
			int digito = Character.getNumericValue(cpf.charAt(i));
			soma += digito * (10 - i);
		}
		
		int resto = soma % 11;
		int primeiroDigitoVerificador = (resto < 2) ? 0 : 11 - resto;
		
		// Verificar o primeiro digito verificador
		
		if (Character.getNumericValue(cpf.charAt(9)) != primeiroDigitoVerificador) {
			System.out.println("CPF inválido!");
			return;
		}
		
		// Calcular o segundo dígito verificado
		
		soma = 0;
		for (int i = 0; i < 10; i++) {
			int digito = Character.getNumericValue(cpf.charAt(i));
			soma += digito * (11 - i);
		}
		
		resto = soma % 11;
		int segundoDigitoVerificador = (resto < 2) ? 0 : 11 - resto;
		
		// Verificar o segundo digito verificador
		
		if (Character.getNumericValue(cpf.charAt(10)) != segundoDigitoVerificador) {
			System.out.println("CPF inválido!");
			return;
		}
		
		System.out.println("CPF Válido!");
		input.close();
	}
}