/*Cargar un arrayList con 12 nombres de estudiantes (String), 
luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.*/

package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ej4 {


		  public static void main(String[] args) {
		      ArrayList<String> seq = new ArrayList<>();  
		      Scanner sc = new Scanner(System.in);
		      String nombre;
		      
		      for (int i=0; i<12; i++){
		          System.out.println("Ingrese nombre: ");
		          nombre = sc.nextLine();
		          seq.add(nombre);
		      }
		      List<String> curso1 = seq.subList(0, 3);
		      List<String> curso2 = seq.subList(4, 7);
		      List<String> curso3 = seq.subList(8, 11);
		        System.out.println(seq+"\n");
		        System.out.println(curso1+"\n");
		        System.out.println(curso2+"\n");
		        System.out.println(curso3+"\n");
		        
		    sc.close();

	}

}
