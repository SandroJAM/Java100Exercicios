// Menu Principal
private static void menu() {
	int opcao = 0;
	do {
		System.out.println()"\n\n*** ERP - Sistema de Controle COmercial ***";
		System.out.println("\n *==============================*");
		System.out.println("|      1 - Fornecedor             |");
		System.out.println("|      2 - Vendedor               |");
		System.out.println("|      3 - Cliente                |");
		System.out.println("|      4 - Produto                |");
		System.out.println("|      5 - Compra                 |");
		System.out.println("|      6 - Venda                  |");
		System.out.println("\n *==============================*");
		System.out.println("|      0 - Sair                   |");
		System.out.println("\n *==============================*");
		
		opcao = Console.readInt("Opção - > ");
		System.out.print("\n");
		switch (opcao) {
		     case 1:
		  	      System.out.println("Módulo fornecedor em desenvolvimento!");
			      break;
		     case 2:
		    	 vendedor();
		    	 break;
		     case 3:
		    	 cliente();
		    	 break;
		     case 4:
		    	 produto();
		    	 break;
		     case 5:
		    	 System.out.println("Módulo comprar em desenvolvimento!");
		     case 6:
		    	 venda();
		     case 0:
		    	 System.out.println("Programa Encerrado!");
		    	 break;
		     default:
		    	 System.out.println("Opção Inválida !!!");
		}
	} while (opcao != 0);
}