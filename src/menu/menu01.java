package menu;

import java.util.Scanner;

public class menu01 {

	public static void main(String[] args) {
		// Menu para rodar no console!
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ERP - Sistema de Controle Comercial");
		System.out.println("===================================");
		System.out.println("|      1 - Fornecedor             |");
		System.out.println("|      2 - Vendedor               |");
		System.out.println("|      3 - Cliente                |");
		System.out.println("|      4 - Produto                |");
		System.out.println("|      5 - Compra                 |");
		System.out.println("|      6 - Venda                  |");
		System.out.println("|=================================|");
		System.out.println("|      0 - Sair                   |");
		System.out.println("===================================");
			
		System.out.println("Escolha uma Opção: ");
		int opcao = input.nextInt();
		switch (opcao) {
			    case 1:
			  	     System.out.println("Módulo fornecedor em desenvolvimento!");
				     break;
			    case 2:
			    	 System.out.println("Módulo vendedor em desenvolvimento!");
			    	 break;
			    case 3:
			    	 System.out.println("Módulo cliente em desenvolvimento!");
			    	 break;
			    case 4:
			    	 System.out.println("Módulo produto desenvolvimento!");
			    	 break;
			    case 5:
			    	 System.out.println("Módulo comprar em desenvolvimento!");
			    case 6:
			    	 System.out.println("Módulo venda em desenvolvimento!");
			    case 0:
			    	 System.out.println("Programa Encerrado!");
			    	 break;
			    default:
			    	 System.out.println("Opção Inválida !!!");
		}
		input.close();	
	}
}