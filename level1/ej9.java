/*Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que
aparece una letra dada.*/

package level1;

import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		String frase;
		char letra;
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese una frase: ");
		frase = sc.nextLine();
		
		System.out.println("Ingrese caracter a buscar: ");
		letra = sc.next().charAt(0);
		
		for (int x=0;x<frase.length();x++) {
			System.out.print(frase.charAt(x));
			if (frase.charAt(x) == letra) {
				contador++;
			}
			   
		}
		System.out.println("\n");
		System.out.println(letra + " aparece " + contador + " veces");
		
		sc.close();
	}
}
