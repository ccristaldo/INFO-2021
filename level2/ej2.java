//Crear un ArrayList, agregar 5 números enteros. 
//Luego, agregar un número entero al principio de la lista y otro al final. 
//Por último, iterar e imprimir los elementos de la lista y el tamaño de la misma 
//(antes y después de agregar a en la primera y última posición).

package level2;

import java.util.*;

public class ej2 {

	public static void main(String[] args) {
		ArrayList<Integer> arreglo = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int numero;
		
		for (int i=0; i<5; i++) {
			System.out.println("Ingrese numero: ");
			numero = sc.nextInt();
			arreglo.add(numero);
		}
		
		for (int num: arreglo) {
		      
		      System.out.println("#" + (arreglo.indexOf(num)+1) + " - " + num);
		    }
		
		System.out.println("Tamanio del arreglo: " + arreglo.size());
		
		System.out.println("Ingrese numero para agregar al inicio: ");
		numero = sc.nextInt();
		arreglo.add(0, numero);
		
		System.out.println("Ingrese numero para agregar al final: ");
		numero = sc.nextInt();
		arreglo.add(arreglo.size(), numero);
		
		System.out.println("Tamanio del arreglo: " + arreglo.size());
		
		for (int num: arreglo) {
		      
		      System.out.println("#" + (arreglo.indexOf(num)+1) + " - " + num);
		    }
		
		sc.close();
	}

}
