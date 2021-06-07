package level2;

import java.util.*;

public class ej1 {

	public static void main(String[] args) {
		ArrayList<String> ciudades = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String ciudad;
		
		for (int i=0; i<3; i++) {
			System.out.println("Ingrese ciudad preferida: ");
			ciudad = sc.nextLine();
			ciudades.add(ciudad);
		}
		 for (String cadena: ciudades) {
		      
		      System.out.println("#" + (ciudades.indexOf(cadena)+1) + " - " + cadena);
		    }
		
		sc.close();
	}
}
