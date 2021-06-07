/*
Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen de carga de horas semanal de un empleado. 
Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar.

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package level2;
import java.util.*;

/**
 *
 * @author carlo
 */
public class ej5 {
    public static void main(String[] args) {
         ArrayList<Integer> totalFinal = new ArrayList<>();
         Integer total = 0;
         
         List<Integer> hsTrab = new ArrayList<Integer>(Arrays.asList(6, 7, 8, 4, 5));
         List<Integer> valorHs = new ArrayList<Integer>(Arrays.asList(350, 345, 550, 600, 320));
         
         for (int i=0; i<hsTrab.size();i++){
             totalFinal.add(hsTrab.get(i)*valorHs.get(i));
         }
         
//        for (int i = 0; i < hsTrab.size(); i++) {
//            totalFinal.add(hsTrab.get(i)*valorHs.get(i));            
//        }
        for (int x : totalFinal){
            total += x;
        }
         //System.out.println(hsTrab);
         //System.out.println(valorHs);
         System.out.println(totalFinal);
         System.out.println("Total Final: $" + total);
         
    }
}
