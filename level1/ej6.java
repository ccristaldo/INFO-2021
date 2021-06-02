/*Se desea una aplicación que solicite 2 números enteros y realice la operación
de potencia (sin uso de librerías).*/

package level1;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		
		int num1, num2;
		double resultado = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese primer numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Ingrese segundo numero: ");
		num2 = sc.nextInt();
		
		for (int i=0; i<num2;i++) {
			resultado = resultado * num1;
		}
		
		System.out.println("Potencia: " + num1 + " elevado a la " + num2 + " = " + resultado);
		
		sc.close();
	}

}
