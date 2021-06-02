/*Se desea una aplicación que solicite 2 números enteros y realice la operación
de multiplicación por sumas sucesivas (sin uso de librerías).*/
package level1;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		
		int num1, num2;
		int resultado = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese primer numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Ingrese segundo numero: ");
		num2 = sc.nextInt();
		
		for (int i=0; i<num2;i++) {
			resultado = resultado + num1;
		}
		
		System.out.println("Multiplicación: " + num1 + " x " + num2 + " = " + resultado);
		
		sc.close();
	}

}
