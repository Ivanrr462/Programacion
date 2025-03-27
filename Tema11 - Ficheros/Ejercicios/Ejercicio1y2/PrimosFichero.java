package Ejercicios.Ejercicio1y2;

import java.io.*;

public class PrimosFichero {
    public static void main(String[] args) {
        String nombreArchivo = "primos.dat";
        escribirPrimos(nombreArchivo);
        leerPrimos(nombreArchivo);
    }

    public static void escribirPrimos(String nombreArchivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (int i = 2; i <= 500; i++) {
                if (esPrimo(i)) {
                    bw.write(i + "\n");
                }
            }
            System.out.println("Números primos guardados en " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    public static void leerPrimos(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("Números primos en el archivo:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
