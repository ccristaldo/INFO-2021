/*Crear una aplicación que solicite de entrada los datos de una persona en este
orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}*/
package level1;

import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		String nombreYapellido, direccion, ciudad;
		int edad;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nombre y Apellido: ");
		nombreYapellido = sc.nextLine();
		
		System.out.println("Edad: ");
		edad = sc.nextInt();
		
		sc.nextLine();//Limpia buffer de entrada
		
		System.out.println("Direccion: ");
		direccion = sc.nextLine();
		
		System.out.println("Ciudad: ");
		ciudad = sc.nextLine();
		
		
		
		System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nombreYapellido );
		
		sc.close();
	}

}
