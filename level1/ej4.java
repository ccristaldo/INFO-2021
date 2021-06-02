/*Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías.*/

package level1;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		
		int num1, aux;
		double fact = 1;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese numero: ");
		num1 = sc.nextInt();
		aux = num1;
		
		while (num1!=0) {
			  fact=fact*num1;
			  num1--;
			}
		
		System.out.println(aux+"! = " + fact);
		sc.close();

	}

}
