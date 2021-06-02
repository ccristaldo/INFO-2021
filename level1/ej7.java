/*Realizar un Programa que dado un String de entrada en minúsculas lo
convierta por completo a mayúsculas. Sin uso de métodos o librerías que
realicen toUppercase().*/
package level1;

import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		
		String cadena;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrada: ");
		cadena = sc.nextLine();
		
		for (int n = 0; n <cadena.length (); n++) { 
			char c = cadena.charAt(n); 
			int asciiChar = c;
			if (asciiChar >= 97 && asciiChar <= 122 ) {
				asciiChar = asciiChar - 32;
			}
						
			System.out.print((char)asciiChar); 
			}
	
		sc.close();
	}

}
