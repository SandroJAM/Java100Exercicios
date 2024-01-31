package condicionais;
import java.util.Scanner;

public class exercicio100_42 {

	public static void main(String[] args) {
		// Calcular o índice de massa corporal - IMC de uma pessoa.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o peso (em quilos Kg): ");
		double peso = scan.nextDouble();
		System.out.println("Informe a altura (em metros): ");
		double altura = scan.nextDouble();
		double imc = peso / (altura * altura);
		
		String categoria;
		
		if (imc < 18.5) {
			categoria = "Abaixo do PESO!";
		} else if (imc < 25) {
			categoria = "PESO Normal!";
		} else if (imc < 30) {
			categoria = "SobrePESO!";
		} else if (imc < 35){
			categoria = "PESO com Obesidade";
		} else {
			categoria = "PESO com Obesidade Grave!";
		}
		System.out.println("O seu IMC é: " + imc);
		System.out.println("Com a categoria: " + categoria);
		scan.close();
	}

}
