package Listas;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayLists01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<String> bandas = new ArrayList<String> ();

		 bandas.add("Rush");
		 System.out.print( "Adicionando a banda Rush: " );
		 System.out.println( Arrays.toString( bandas.toArray() ) );

		 bandas.add("Beatles");
		 System.out.print( "Adicionando a banda Beatles: " );
		 System.out.println( Arrays.toString( bandas.toArray() ) );

		 bandas.add("Iron Maiden");
		 System.out.print( "Adicionando a banda Iron Maiden: " );
		 System.out.println( Arrays.toString( bandas.toArray() ) );

		 System.out.print( "Quem está na índice 0: " );
		 System.out.println( bandas.get(0) );

		 System.out.print( "Adicionando Tiririca onde estava o Rush: " );
		 bandas.add( bandas.indexOf("Beatles"), "Tiririca");
		 System.out.println( Arrays.toString( bandas.toArray() ) );

		 System.out.print( "Número de elementos na lista: " );
		 System.out.println( bandas.size() );

		 System.out.print( "Removendo o Tiririca: " );
		 bandas.remove("Tiririca");
		 System.out.println( Arrays.toString( bandas.toArray() ) );

		 System.out.print( "Removendo tudo: " );
		 bandas.clear();

	}
}