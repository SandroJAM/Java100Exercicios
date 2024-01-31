package lacosderepeticao;

public class exercicio100_51 {

	public static void main(String[] args) {
		// Imprimri na tela a TABUADA
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println("Tabuada do " + i +":");
			
			for(int j = 1; j <= 10; j++) {
				int resultado = i + j; // Poder alternara para +, -, * e / (soma, subtração, multiplicação e divisão
				System.out.println(i + " + " + j + " = " + resultado);
			}
			
			System.out.println(); // Linha em branco para separar TABUADA!
			
		}
	}
}