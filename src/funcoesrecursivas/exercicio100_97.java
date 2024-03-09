package funcoesrecursivas;

public class exercicio100_97 {

	public static void main(String[] args) {
		// Função Recursiva para inverter um String;
		
		String texto = "Olá, Mundo!";
		String textoInvertido = inverterString(texto);
		System.out.println("Texto original: " + texto);
		System.out.println("Texo invertido: " + textoInvertido);
	}
	
	public static String inverterString(String texto) {
		if(texto.isEmpty()) {
			return texto;
		} else {
			char primeiroChar = texto.charAt(0);
			String restoString = texto.substring(1);
			return inverterString(restoString) + primeiroChar;
		}
	}
	
}