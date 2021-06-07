/*Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa 
(solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), 
imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.*/

package level2;

import java.util.*;

public class ej3 {

	public static void main(String[] args) {
		ArrayList<Integer> arreglo = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		for (int i=1;i<53;i++) {
			arreglo.add(i);
		}
		
		for (int it : arreglo) {
			System.out.print(it + " ");
		}
		
		System.out.print("\n\n");
		
		Collections.sort(arreglo, Collections.reverseOrder());
		
		for (int it : arreglo) {
			System.out.print(it + " ");
		}
		
		System.out.print("\n\n");
		
		Collections.shuffle(arreglo);
		
		for (int it : arreglo) {
			System.out.print(it + " ");
		}
		
		sc.close();
	}

}
