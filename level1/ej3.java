/*Confeccionar un programa que dado un número entero como dato de
entrada imprima la secuencia de números (incrementos de 1) de la siguiente
forma:*/
package level1;

import java.util.Scanner;

public class ej3 {
	
	public static void main(String[] args) {
		
		int num1;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese numero: ");
		num1 = sc.nextInt();
		
		for (int i=1; i<=num1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
		
		sc.close();
		
	}

}
