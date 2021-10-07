package Ej3;

/*Dado un archivo de texto (alumnos.txt), crear una función que lea todos los nombres de los alumnos y los imprima por pantalla.
        Observación:
        Cada línea del archivo representa un nombre de alumno.*/


import java.io.*;

public class Ejercicio3 {
    public final static String archivo = "/home/ccristaldo/Documentos/prueba.txt";

    public static void leerArchivo() throws FileNotFoundException {


        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);

        String linea;
        try{
            do {
                linea = br.readLine();
                System.out.println(linea);
            }
            while (linea != null);

        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter(archivo);
        PrintWriter pw = new PrintWriter(fw);


        try
        {
            for (int i = 0; i < 10; i++)

                pw.println("Linea " + i);

        } catch (Exception e) {
            e.printStackTrace();
        }
        fw.close();
        leerArchivo();
    }
}
