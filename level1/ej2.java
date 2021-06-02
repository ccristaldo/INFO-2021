/*Realizar un programa que solicite por consola 2 números enteros. Para luego
imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto
de la división) de ambos números.*/
package level1;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese primer numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Ingrese segundo numero: ");
		num2 = sc.nextInt();
		
		System.out.println("Suma: " + num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println("Resta: " + num1 + " - " + num2 + " = " + (num1-num2));
		System.out.println("Multiplicación: " + num1 + " x " + num2 + " = " + (num1*num2));
		System.out.println("División: " + num1 + " / " + num2 + " = " + (num1/num2));
		System.out.println("Módulo: " + num1 + " % " + num2 + " = " + (num1%num2));
		
		sc.close();
	}

}
