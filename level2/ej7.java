package level2;

import java.util.*;

public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> arreglo = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese menor");
		int menor = sc.nextInt();
		System.out.println("Ingrese mayor");
		int mayor = sc.nextInt();
		
		for (int i = menor; i<mayor; i++ ) {
			if (i%2==0 && i%3==0) {
				arreglo.add("FizzBuzz");
			}else {
				if(i%2==0) {
					arreglo.add("Fizz");
				}else {
					if(i%3==0) {
						arreglo.add("Buzz");
					}else {
						arreglo.add(i);
					}
				}
			}
			
		}
		
		for (Object n:arreglo) {
			System.out.println(n + " ");
		}
		sc.close();
	}

}
