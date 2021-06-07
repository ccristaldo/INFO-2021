/*Se dispone de una lista de Empleados, de cada empleado se conoce:
Nombre y Apellido
DNI
horasTrabajadas
valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo 
(horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map (o Diccionario) 
donde la clave (key) es el dni y el valor (value) es el sueldo calculado. 
*/

package level2;

import java.util.*;


public class ej6 {
	static class Empleado{
		private int DNI;
		private double horasTrabajadas;
		private double valorPorHora;
		
		Empleado(int DNI, double horasTrabajadas, double valorPorHora){
			this.DNI = DNI;
			this.horasTrabajadas = horasTrabajadas;
			this.valorPorHora = valorPorHora;
		}

		public int getDNI() {
			return DNI;
		}

		public void setDNI(int dNI) {
			DNI = dNI;
		}

		public double getHorasTrabajadas() {
			return horasTrabajadas;
		}

		public void setHorasTrabajadas(double horasTrabajadas) {
			this.horasTrabajadas = horasTrabajadas;
		}

		public double getValorPorHora() {
			return valorPorHora;
		}

		public void setValorPorHora(double valorPorHora) {
			this.valorPorHora = valorPorHora;
		}
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Empleado> plantel = new HashSet<Empleado>();
		
		
		HashMap <Integer, Empleado> map = new HashMap <Integer, Empleado> ();
		HashMap plantelMap = new HashMap ();
		
		for (int i=0; i<3; i++) {
			System.out.println("Ingrese DNI");
			int DNI = sc.nextInt();
			System.out.println("Ingrese Horas Trabajadas");
			double horasTrabajadas = sc.nextDouble();
			sc.nextLine();
			System.out.println("Ingrese Valor Hora");
			double valorHora = sc.nextDouble();
			sc.nextLine();
			
			Empleado persona = new Empleado(DNI, horasTrabajadas, valorHora);
			
			plantel.add(persona);
			
			
		}
		
	
		for (Empleado p:plantel) {
			System.out.println(p.getDNI() + " " + p.getHorasTrabajadas() + " " + p.valorPorHora);
			plantelMap.put(p.getDNI(),(p.getValorPorHora()*p.getHorasTrabajadas()));
		}
		
		Iterator it = plantelMap.keySet().iterator();
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("Clave: " + key + " -> Valor: " + plantelMap.get(key));
		}
		
		
		
		
		
		sc.close();
	}

}
