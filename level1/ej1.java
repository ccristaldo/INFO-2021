package level1;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		
		String nombre;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese Nombre: ");
		nombre = sc.nextLine();
		System.out.println("Hola, " + nombre + "!!!");
		
		sc.close();
	}

}
