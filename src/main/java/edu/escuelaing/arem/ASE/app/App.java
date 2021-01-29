package edu.escuelaing.arem.ASE.app;

import edu.escuelaing.arem.stat.StatCalc;
import edu.escuelaing.arem.util.LinkedList;

import java.io.*;

/**
 * Calculadora estadistica app
 */
public class App {
    public static void main( String[] args ) throws IOException {
        File archivo = new File("Datos.txt");
        FileReader fileReader = new FileReader(archivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        Double numDatos = Double.parseDouble(bufferedReader.readLine());
        LinkedList<Double> valores = new LinkedList<>();
        for (int i=0; i<numDatos;i++){
            valores.add(Double.parseDouble(bufferedReader.readLine()));
        }
        System.out.println("la media para los valores entregados es: "+ StatCalc.mean(valores));
        System.out.println("la desviacion estandar para los valores entregados es: "+ StatCalc.stddev(valores));

    }
}
